/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.comps.taskpane;

import br.com.gmp.comps.BaseColors;
import br.com.gmp.comps.ui.GMPTaskPaneUI;
import java.awt.Color;
import javax.swing.Icon;
import org.jdesktop.swingx.JXTaskPane;

/**
 *
 * @author kaciano
 */
public class GMPTaskPane extends JXTaskPane {

    private Color initialColor;
    private Color finalColor;
    private Color textColor;
    private Color highlight;

    /**
     * Cria nova instancia de GMPTaskPane
     */
    public GMPTaskPane() {
        initialize();
    }

    /**
     * Cria nova instancia de GMPTaskPane
     *
     * @param initialColor Color Cor inicial do gradiente
     * @param finalColor Color Cor final do gradiente
     * @param textColor Color Cor do texto
     * @param highlight Color Cor do realce
     */
    public GMPTaskPane(Color initialColor, Color finalColor, Color textColor, Color highlight) {
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        this.textColor = textColor;
        this.highlight = highlight;
        initialize();
    }

    /**
     *
     * @param initialColor Color Cor inicial do gradiente
     * @param finalColor Color Cor final do gradiente
     * @param textColor Color Cor do texto
     * @param highlight Color Cor do realce
     * @param icon Icon Icone do painel
     */
    public GMPTaskPane(Color initialColor, Color finalColor, Color textColor, Color highlight, Icon icon) {
        super(icon);
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        this.textColor = textColor;
        this.highlight = highlight;
        initialize();
    }

    /**
     *
     * @param initialColor Color Cor inicial do gradiente
     * @param finalColor Color Cor final do gradiente
     * @param textColor Color Cor do texto
     * @param highlight Color Cor do realce
     * @param title String titulo do painel
     */
    public GMPTaskPane(Color initialColor, Color finalColor, Color textColor, Color highlight, String title) {
        super(title);
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        this.textColor = textColor;
        this.highlight = highlight;
        initialize();
    }

    /**
     *
     * @param initialColor Color Cor inicial do gradiente
     * @param finalColor Color Cor final do gradiente
     * @param textColor Color Cor do texto
     * @param highlight Color Cor do realce
     * @param title String titulo do painel
     * @param icon Icon Icone do painel
     */
    public GMPTaskPane(Color initialColor, Color finalColor, Color textColor, Color highlight, String title, Icon icon) {
        super(title, icon);
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        this.textColor = textColor;
        this.highlight = highlight;
        initialize();
    }

    /**
     * Inicializa o componente
     */
    private void initialize() {
        initComponents();
        initialColor = initialColor != null ? initialColor : BaseColors.lightColor;
        finalColor = finalColor != null ? finalColor : BaseColors.darkColor;
        textColor = textColor != null ? textColor : Color.white;
        highlight = highlight != null ? highlight : BaseColors.systemColor;
        if (isSpecial()) {
            finalColor = initialColor;
        }        
        this.setUI(new GMPTaskPaneUI(initialColor, finalColor, textColor, highlight));
        this.setCollapsed(true);
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     *
     * @return
     */
    public Color getInitialColor() {
        return initialColor;
    }

    /**
     *
     * @param initialColor
     */
    public void setInitialColor(Color initialColor) {
        this.initialColor = initialColor;
    }

    /**
     *
     * @return
     */
    public Color getFinalColor() {
        return finalColor;
    }

    /**
     *
     * @param finalColor
     */
    public void setFinalColor(Color finalColor) {
        this.finalColor = finalColor;
    }

    /**
     *
     * @return
     */
    public Color getTextColor() {
        return textColor;
    }

    /**
     *
     * @param textColor
     */
    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    /**
     *
     * @return
     */
    public Color getHighlight() {
        return highlight;
    }

    /**
     *
     * @param highlight
     */
    public void setHighlight(Color highlight) {
        this.highlight = highlight;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

    }
    // </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
