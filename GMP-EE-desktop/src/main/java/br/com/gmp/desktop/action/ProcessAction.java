package br.com.gmp.desktop.action;

import br.com.gmp.desktop.app.VisualApp;
import java.awt.event.ActionEvent;

/**
 * Ação de processamento
 *
 * @author kaciano
 */
public class ProcessAction extends GMPAction {

    public ProcessAction(String name, VisualApp visualApp) {
        super(name, visualApp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getVisualApp().getAppBean().confirm();
    }

}
