package br.com.gmp.desktop.app.action;

import br.com.gmp.desktop.app.VisualApp;
import java.awt.event.ActionEvent;

/**
 * Ação de Ajuda
 *
 * @author kaciano
 */
public class HelpAction extends FrameAction {

    public HelpAction(String name, VisualApp visualApp) {
        super(name, visualApp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Help event.");
        getVisualApp().getAppBean().help();
    }

}
