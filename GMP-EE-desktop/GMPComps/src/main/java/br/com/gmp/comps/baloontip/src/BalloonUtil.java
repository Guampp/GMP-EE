package br.com.gmp.comps.baloontip.src;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import net.java.balloontip.BalloonTip;

/**
 * Utilitário para demonstração de balões de mensagens
 *
 * @author kaciano
 */
public class BalloonUtil {

    /**
     * Mostra um balão contendo a mensagem por um determinado periodo de tempo
     *
     * @param component <b>Component</b> Objeto de base
     * @param msg <b>String</b> Mensagem
     * @param millis <b>Long</b> Tempo em milisegundos
     */
    public static void showTimedBallon(final JComponent component, final String msg, final Long millis) {
        new Thread() {
            @Override
            public void run() {
                try {
                    BalloonTip balloon = new BalloonTip(component, msg);
                    sleep(millis);
                    balloon.closeBalloon();
                } catch (InterruptedException ex) {
                    Logger.getLogger(BalloonUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
    }
}
