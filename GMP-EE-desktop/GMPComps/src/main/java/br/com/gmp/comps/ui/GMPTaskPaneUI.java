package br.com.gmp.comps.ui;

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
 *
 * @author Kaciano
 */
public class GMPTaskPaneUI extends BasicTaskPaneUI {
    Color color;
    public GMPTaskPaneUI() {
    }

    public GMPTaskPaneUI(Color color) {
        this.color = color;
    }

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
        return new MetalPaneBorder();
    }

    class MetalPaneBorder extends PaneBorder {

        public MetalPaneBorder() {
            titleBackgroundGradientStart = Color.GRAY;
            titleForeground = Color.white;
            titleOver = color != null ? color : Color.orange;
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
}
