package br.com.gmp.desktop.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Gerador de códigos Hash
 *
 * @author kaciano
 */
public class Hasher {

    /**
     * Retorna codificação da Array referenciada
     *
     * @param bytes Array de bytes da String referenciada
     * @return
     */
    private static String stringHexa(byte[] bytes) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
            int parteBaixa = bytes[i] & 0xf;
            if (parteAlta == 0) {
                s.append('0');
            }
            s.append(Integer.toHexString(parteAlta | parteBaixa));
        }
        return s.toString();
    }

    /**
     * Calcula o hash
     *
     * @param text String referenciada
     * @param algorithm Algoritmo de codificação
     * @return Array de bytes da String referenciada
     */
    private static byte[] generateHash(String text, String algorithm) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(text.getBytes());
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /**
     * Retorna o hash code da String referenciada
     *
     * @param text String referenciada
     * @return Hash code calculado
     */
    public String encode(String text) {
        return stringHexa(generateHash(text, "MD5"));
    }
}
