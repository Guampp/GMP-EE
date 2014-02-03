/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comps.annotations;

import java.lang.annotation.*;

/**
 *
 * @author kaciano
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IsColumn {
}
