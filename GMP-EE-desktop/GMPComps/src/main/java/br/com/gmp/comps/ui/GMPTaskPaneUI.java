package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;

import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.plaf.basic.BasicTaskPaneUI;

/**
 * UI customizada para GMPTaskPane
 *
 * @author Kaciano
 */
public class GMPTaskPaneUI extends BasicTaskPaneUI {

    private Color initialColor;
    private Color finalColor;
    private Color textColor;
    private Color highlight;

    /**
     * Cria nova instancia de GMPTaskPaneUI
     */
    public GMPTaskPaneUI() {
        initialColor = BaseColors.lightColor;
        finalColor = BaseColors.darkColor;
        textColor = Color.white;
        highlight = BaseColors.systemColor;
    }

    /**
     * Cria nova instancia de GMPTaskPaneUI
     *
     * @param initialColor Color Cor inicial do gradiente
     * @param finalColor Color Cor final do gradiente
     * @param textColor Color Cor do texto
     * @param highlight Color Cor do realce
     */
    public GMPTaskPaneUI(Color initialColor, Color finalColor, Color textColor, Color highlight) {
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        this.textColor = textColor;
        this.highlight = highlight;        
    }

    /**
     *
     * @param c
     * @return
     */
    public static ComponentUI createUI(JComponent c) {
        return new GMPTaskPaneUI();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        group.setOpaque(false);
    }

    @Override
    protected Border createPaneBorder() {
        return new CustomPaneBorder(initialColor, finalColor, textColor, highlight);
    }

    /**
     * Borda de painel customizada
     */
    class CustomPaneBorder extends PaneBorder {

        public CustomPaneBorder(Color start, Color end, Color foreground, Color highlight) {
            titleBackgroundGradientStart = start != null ? start : BaseColors.lightColor;
            titleBackgroundGradientEnd = end != null ? end : BaseColors.darkColor;
            titleForeground = foreground != null ? foreground : Color.white;
            titleOver = highlight != null ? highlight : BaseColors.systemColor;          
            
        }

        @Override
        protected void paintExpandedControls(JXTaskPane group, Graphics g, int x,
                int y, int width, int height) {
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_OFF);
            g.setColor(getPaintColor(group));
            paintRectAroundControls(group, g, x, y, width, height, g.getColor(),
                    g.getColor());
            paintChevronControls(group, g, x, y, width, height);

            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_OFF);
        }

        @Override
        protected boolean isMouseOverBorder() {
            return true;
        }
    }

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

}
