/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author kaciano
 */
public class LookUpper {

    public static Object lookUp(String bean) throws NamingException {
        return new InitialContext().lookup(bean);
    }

}
