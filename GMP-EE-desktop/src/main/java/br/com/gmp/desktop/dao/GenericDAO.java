package br.com.gmp.desktop.dao;

import br.com.gmp.desktop.ejb.LookUpper;
import java.lang.reflect.ParameterizedType;
import javax.naming.NamingException;

public abstract class GenericDAO<T> implements IGenericDAO<T> {

    private final Class<T> ejbClass;

    /**
     * Objeto de administração do EJB generico
     */
    public GenericDAO() {
        this.ejbClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * Retorna Objeto de administração a partir do nome do EJB
     *
     * @param ejb Nome do EJB
     * @return EJB
     * @throws javax.naming.NamingException Exceção de nome desconhecido
     */
    @Override
    public T getDAO(String ejb) throws NamingException {
        return (T) LookUpper.lookUp(ejb);
    }

    public Class<T> getEjbClass() {
        return ejbClass;
    }

}
