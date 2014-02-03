/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaciano
 */
public class XMLUtil {

    /**
     * 
     * @param title
     * @param object 
     */
    public void writeXML(String title, Object object) {
        XMLEncoder e;
        try {
            e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(title + ".xml")));
            e.writeObject(object);
            e.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 
     * @param title
     * @return 
     */
    public Object readXML(String title) {
        XMLDecoder d;
        try {
            d = new XMLDecoder(new BufferedInputStream(new FileInputStream(title + ".xml")));
            Object result = d.readObject();
            d.close();
            return result;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLUtil.class.getName()).log(Level.SEVERE, null, ex);
            return new Object();
        }
    }
}
