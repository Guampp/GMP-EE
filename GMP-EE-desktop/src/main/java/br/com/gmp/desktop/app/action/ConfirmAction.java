package br.com.gmp.desktop.app.action;

import br.com.gmp.desktop.app.VisualApp;
import java.awt.event.ActionEvent;

/**
 * Ação de confirmação
 *
 * @author kaciano
 */
public class ConfirmAction extends FrameAction {

    public ConfirmAction(String name, VisualApp visualApp) {
        super(name, visualApp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Confirm event.");
        getVisualApp().getAppBean().confirm();
    }

}
