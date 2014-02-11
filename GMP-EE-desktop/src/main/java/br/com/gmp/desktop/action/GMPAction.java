package br.com.gmp.desktop.action;

import br.com.gmp.desktop.app.VisualApp;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 * Ação padrão dos GMPFrames
 *
 * @author kaciano
 */
public class GMPAction extends AbstractAction {

    private VisualApp visualApp;

    /**
     * Cria nova instancia
     *
     * @param name Nome da ação
     * @param visualApp VisualApp da ação
     */
    public GMPAction(String name, VisualApp visualApp) {
        super(name);
        this.visualApp = visualApp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.visualApp.getAppBean().confirm();
    }

    /**
     * Retorna o VisualApp
     *
     * @return <code>VisualApp</code> VisualApp da ação
     */
    public VisualApp getVisualApp() {
        return visualApp;
    }

    /**
     * Modifica o VisualApp
     *
     * @param visualApp VisualApp da ação
     */
    public void setVisualApp(VisualApp visualApp) {
        this.visualApp = visualApp;
    }
}
