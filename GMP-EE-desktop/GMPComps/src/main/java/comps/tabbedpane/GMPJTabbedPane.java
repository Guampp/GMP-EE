package comps.tabbedpane;

import comps.BaseColors;
import comps.button.ButtonTabComponent;
import comps.ui.CustomTabbedPaneUI;
import comps.ui.GMPTabbedPaneUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author kaciano
 */
public class GMPJTabbedPane extends JTabbedPane {

    private Component locked;
    private Color borderColor;
    private Color darkShadow;
    private Color light;
    private Color highlight;
    private Color focus;
    private Color selected;
    private Color unselectedBackground;
    private Color selectHighlight;
    private Color borderHightlightColor;

    /**
     * Cria nova instancia de GMPJTabbedPane
     */
    public GMPJTabbedPane() {
        defaultColoring();
        initComponents();
        changeTabbedPane();
    }

    /**
     * Cria nova instancia de GMPJTabbedPane
     *
     * @param locked Componente que não pode ser fechado
     */
    public GMPJTabbedPane(Component locked) {
        this.locked = locked;
        defaultColoring();
        initComponents();
        changeTabbedPane();
    }

    /**
     * Cria nova instancia de GMPJTabbedPane
     *
     * @param borderColor Cor da borda
     * @param darkShadow Cor da sombra
     * @param light Cor mais clara
     * @param highlight Cor de destacamento
     * @param focus Cor de foco
     * @param selected Cor de seleção
     * @param unselectedBackground Cor de fundo para não selecionados
     * @param selectHighlight Cor de destaque para selecionados
     * @param borderHightlightColor Cor de destaque para borda de selecionados
     */
    public GMPJTabbedPane(Color borderColor, Color darkShadow, Color light, Color highlight, Color focus, Color selected, Color unselectedBackground, Color selectHighlight, Color borderHightlightColor) {
        this.borderColor = borderColor;
        this.darkShadow = darkShadow;
        this.light = light;
        this.highlight = highlight;
        this.focus = focus;
        this.selected = selected;
        this.unselectedBackground = unselectedBackground;
        this.selectHighlight = selectHighlight;
        this.borderHightlightColor = borderHightlightColor;
        changeTabbedPane();
    }

    /**
     * Cria nova instancia de GMPJTabbedPane
     *
     * @param locked Componente que não pode ser fechado
     * @param borderColor Cor da borda
     * @param darkShadow Cor da sombra
     * @param light Cor mais clara
     * @param highlight Cor de destacamento
     * @param focus Cor de foco
     * @param selected Cor de seleção
     * @param unselectedBackground Cor de fundo para não selecionados
     * @param selectHighlight Cor de destaque para selecionados
     * @param borderHightlightColor Cor de destaque para borda de selecionados
     */
    public GMPJTabbedPane(Component locked, Color borderColor, Color darkShadow, Color light, Color highlight, Color focus, Color selected, Color unselectedBackground, Color selectHighlight, Color borderHightlightColor) {
        this.locked = locked;
        this.borderColor = borderColor;
        this.darkShadow = darkShadow;
        this.light = light;
        this.highlight = highlight;
        this.focus = focus;
        this.selected = selected;
        this.unselectedBackground = unselectedBackground;
        this.selectHighlight = selectHighlight;
        this.borderHightlightColor = borderHightlightColor;
        changeTabbedPane();
    }

    /**
     * Inicializa as cores padrão
     */
    private void defaultColoring() {
        borderColor = BaseColors.darkColor;
        darkShadow = BaseColors.darkColor;
        light = BaseColors.lightColor;
        highlight = BaseColors.lightColor;
        focus = BaseColors.lightColor;
        selected = BaseColors.systemColor;
        unselectedBackground = BaseColors.lightColor;
        selectHighlight = BaseColors.lightColor;
        borderHightlightColor = BaseColors.lightColor;
    }

    /**
     * Mudanças aplicadas no UIManager para customização do tabbedpane
     */
    private void changeTabbedPane() {
        this.setUI(new GMPTabbedPaneUI());
    }

    /**
     * Retorna componente que não pode ser fechado
     *
     * @return Componente
     */
    public Component getLocked() {
        return locked;
    }

    /**
     * Determina componente que não pode ser fechado
     *
     * @param locked Componente que não pode ser fechado
     */
    public void setLocked(Component locked) {
        this.locked = locked;
    }

    /**
     * Retorna o index de tab do componente referenciado
     *
     * @param component Componente referenciado
     * @return Index do componente
     */
    public int getComponentTabIndex(Component component) {
        int index = 0;
        this.indexOfTabComponent(component);
        int componentCount = this.getComponentCount();
        for (int i = 0; i < componentCount; i++) {
            if (this.getComponentAt(i).equals(component)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Adiciona nova tab com botão para fechar
     *
     * @param title Titulo da tab
     * @param icon Icone da tab
     * @param component Componente da tab
     * @param tooltip Dica da tab
     */
    public void addClosableTab(String title, Icon icon, Component component, String tooltip) {
        if (icon != null) {
            this.addTab(title, icon, component, tooltip);
        } else {
            this.addTab(title, component);
        }
        int index = getComponentTabIndex(component);
        this.setTabComponentAt(index, new ButtonTabComponent(this, icon));
    }

    /**
     * Adiciona nova tab com botão para fechar
     *
     * @param title Titulo da tab
     * @param component Componente da tab
     */
    public void addClosableTab(String title, Component component) {
        this.addTab(title, component);
        int index = getComponentTabIndex(component);
        this.setTabComponentAt(index, new ButtonTabComponent(this, null));
    }

    /**
     * Remove a tab selecionada
     *
     * @param evt MouseEvent
     */
    public void removeTab(MouseEvent evt) {
        Component sel = this.getSelectedComponent();
        if (sel != null && !sel.equals(locked)
                && evt.getButton() == MouseEvent.BUTTON2) {
            this.remove(sel);
        }
    }

    /**
     *
     * @return
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     *
     * @param borderColor
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    /**
     *
     * @return
     */
    public Color getDarkShadow() {
        return darkShadow;
    }

    /**
     *
     * @param darkShadow
     */
    public void setDarkShadow(Color darkShadow) {
        this.darkShadow = darkShadow;
    }

    /**
     *
     * @return
     */
    public Color getLight() {
        return light;
    }

    /**
     *
     * @param light
     */
    public void setLight(Color light) {
        this.light = light;
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

    /**
     *
     * @return
     */
    public Color getFocus() {
        return focus;
    }

    /**
     *
     * @param focus
     */
    public void setFocus(Color focus) {
        this.focus = focus;
    }

    /**
     *
     * @return
     */
    public Color getSelected() {
        return selected;
    }

    /**
     *
     * @param selected
     */
    public void setSelected(Color selected) {
        this.selected = selected;
    }

    /**
     *
     * @return
     */
    public Color getUnselectedBackground() {
        return unselectedBackground;
    }

    /**
     *
     * @param unselectedBackground
     */
    public void setUnselectedBackground(Color unselectedBackground) {
        this.unselectedBackground = unselectedBackground;
    }

    /**
     *
     * @return
     */
    public Color getSelectHighlight() {
        return selectHighlight;
    }

    /**
     *
     * @param selectHighlight
     */
    public void setSelectHighlight(Color selectHighlight) {
        this.selectHighlight = selectHighlight;
    }

    /**
     *
     * @return
     */
    public Color getBorderHightlightColor() {
        return borderHightlightColor;
    }

    /**
     *
     * @param borderHightlightColor
     */
    public void setBorderHightlightColor(Color borderHightlightColor) {
        this.borderHightlightColor = borderHightlightColor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
