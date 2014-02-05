package br.com.gmp.desktop.dao;

import javax.naming.NamingException;

/**
 * Interface generica para Objetos administradores do banco de dados
 *
 * @author kaciano
 * @param <T>
 */
public interface IGenericDAO<T> {

    T getDAO(String ejb) throws NamingException;
}
