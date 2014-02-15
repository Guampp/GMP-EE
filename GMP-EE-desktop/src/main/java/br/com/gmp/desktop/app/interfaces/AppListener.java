package br.com.gmp.desktop.app.interfaces;

import br.com.gmp.desktop.views.ViewFrame;
import br.com.gmp.desktop.views.interfaces.View;
import javax.swing.JDesktopPane;

/**
 * Interface para o AppAppListener
 *
 * @author kaciano
 * @param <T> Classe do AppListener
 */
public interface AppListener<T> {

    /**
     * Adiciona novo desktop
     */
    void addDesktop();

    /**
     * Verifica existencia de activeView
     *
     * @return activeView <code><b>boolean</b></code> Existe uma View ativa?
     * <code>(true, false)</code>
     */
    boolean checkNull();

    /**
     * Ativa o evento de ajuda do sistema
     */
    void help();

    /**
     * Ativa o evento de confirmação
     */
    void confirm();

    /**
     * Ativa o evento de descarte
     */
    void discard();

    /**
     * Ativa o evento de limpeza
     */
    void clean();

    /**
     * Adiciona View aos favoritos
     */
    void favoriteView();

    /**
     * Retorna desktop ativo
     *
     * @return Desktop ativo
     */
    JDesktopPane getActiveDesktop();

    /**
     * Retorna a View Ativa do desktop
     *
     * @return <code><b>View</b></code> View Ativa do desktop
     */
    View getActiveView();

    /**
     * Insere View no desktop ativo
     *
     * @param view <code><b>View</b></code> View a ser adicionada
     */
    void insertView(ViewFrame view);

    /**
     * Carrega os dados
     */
    void load();

    /**
     * Ativa o evento de processamento
     */
    void process();

    /**
     * Recarrega os dados
     */
    void reload();

    /**
     * Remove todos os desktops
     */
    void removeAllDesktops();

    /**
     * Procura View a partir do nome
     *
     * @param name <code><b>String</b></code> Nome da View
     */
    void searchView(String name);

    /**
     * Modifica a View Ativa do desktop
     *
     * @param activeView <code><b>View</b></code> View Ativa do desktop
     */
    void setActiveView(ViewFrame activeView);

    /**
     * Modifica o aplicativo visual do bean
     *
     * @param visualApp <code><b>VisualApp</b></code> Aplicativo visual do bean
     */
    void setVisualApp(T visualApp);

}
