package br.com.gmp.ejb.controlers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Controlador genérico para extender em outros controladores
 *
 * @author kaciano
 * @version 1.0
 */
public class GenericControler {

    @PersistenceContext(unitName = "GMP-EJB-PU")
    protected EntityManager em;

}
