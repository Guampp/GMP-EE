package br.com.gmp.desktop.app.action;

import br.com.gmp.desktop.app.VisualApp;
import java.awt.event.ActionEvent;

/**
 * Ação de descarte
 *
 * @author kaciano
 */
public class DiscardAction extends FrameAction {

    /**
     *
     * @param name
     * @param visualApp
     */
    public DiscardAction(String name, VisualApp visualApp) {
        super(name, visualApp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Discard event.");
        getVisualApp().getAppBean().confirm();
    }

}
