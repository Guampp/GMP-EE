package br.com.gmp.utils.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Coleção de métodos utilitários para trabalhar <b>Reflection</b>
 *
 * @author kaciano
 * @version 1.0
 */
public class ReflectionUtil {

    /**
     * Retorna o objeto instanciado a partir dos dados recebidos
     *
     * @param cl <code><b>Class</b></code> Classe da instancia
     * @param argTypes <code><b>Class</b>[]</code> Array de argumentos da
     * instancia(Classes dos objetos a serem passados como parametro)
     * @param arguments <code><b>Object</b>[]</code> Valores dos parametros
     * @return <code><b>Object</b></code> Objeto instanciado
     * @throws java.lang.InstantiationException
     */
    public Object newInstance(Class cl, Class[] argTypes, Object[] arguments) throws InstantiationException {
        try {
            Constructor declaredConstructor = cl.getDeclaredConstructor(argTypes);
            return declaredConstructor.newInstance(arguments);
        } catch (NoSuchMethodException | SecurityException |
                InstantiationException | IllegalAccessException |
                IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(ReflectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new InstantiationException();
    }

    /**
     * Retorna o objeto instanciado a partir do objeto de instancia recebido
     *
     * @param instance <code><b>ObjectInstance</b></code> Objeto com os dados da
     * instancia
     * @return <code><b>Object</b></code> Objeto instanciado
     * @throws java.lang.InstantiationException
     */
    public Object newInstance(ObjectInstance instance) throws InstantiationException {
        return newInstance(instance.getCl(), instance.getArgTypes(),
                instance.getArguments());
    }

}
