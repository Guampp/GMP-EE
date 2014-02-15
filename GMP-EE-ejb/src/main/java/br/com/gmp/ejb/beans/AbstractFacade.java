/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author kaciano
 * @param <T>
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    /**
     *
     * @param entity
     */
    public void createLocal(T entity) {
        getEntityManager().persist(entity);
    }

    /**
     *
     * @param entity
     */
    public void editLocal(T entity) {
        getEntityManager().merge(entity);
    }

    /**
     *
     * @param entity
     */
    public void removeLocal(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    /**
     *
     * @param id
     * @return
     */
    public T findLocal(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    /**
     *
     * @return
     */
    public List<T> findAllLocal() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     *
     * @param range
     * @return
     */
    public List<T> findRangeLocal(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    /**
     *
     * @return
     */
    public int countLocal() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    /**
     *
     * @param entity
     */
    public void create(T entity) {
        createLocal(entity);
    }

    /**
     *
     * @param entity
     */
    public void edit(T entity) {
        editLocal(entity);
    }

    /**
     *
     * @param entity
     */
    public void remove(T entity) {
        removeLocal(entity);
    }

    /**
     *
     * @param id
     * @return
     */
    public T find(Object id) {
        return findLocal(id);
    }

    /**
     *
     * @return
     */
    public List<T> findAll() {
        return findAllLocal();
    }

    /**
     *
     * @param range
     * @return
     */
    public List<T> findRange(int[] range) {
        return findRangeLocal(range);
    }

    /**
     *
     * @return
     */
    public int count() {
        return countLocal();
    }

}
