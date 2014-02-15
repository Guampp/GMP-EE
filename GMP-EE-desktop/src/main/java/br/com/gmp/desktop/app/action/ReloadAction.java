package br.com.gmp.desktop.app.action;

import br.com.gmp.desktop.app.VisualApp;
import java.awt.event.ActionEvent;

/**
 * Ação de recarregamento
 *
 * @author kaciano
 */
public class ReloadAction extends FrameAction {

    public ReloadAction(String name, VisualApp visualApp) {
        super(name, visualApp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Reload event.");
        getVisualApp().getAppBean().reload();
    }

}
