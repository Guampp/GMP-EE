package br.com.gmp.desktop.app.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static javax.swing.Action.NAME;
import javax.swing.JOptionPane;

/**
 * Classe da mensagem de ação
 *
 * @author kaciano
 */
public class MessageAction extends AbstractAction {

    private String _msg;

    public MessageAction(String name, String msg) {
        System.out.println("Ação " + name + " invocada.");
        putValue(NAME, name);
        _msg = msg;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, _msg);
    }
}
