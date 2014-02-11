package br.com.gmp.desktop.action;

import br.com.gmp.desktop.app.VisualApp;
import java.awt.event.ActionEvent;

/**
 * Ação de limpeza
 *
 * @author kaciano
 */
public class CleanAction extends GMPAction {

    public CleanAction(String name, VisualApp visualApp) {
        super(name, visualApp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getVisualApp().getAppBean().confirm();
    }

}
