package br.com.gmp.comps.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author kaciano
 */
public class GMPTabbedPaneUI2 extends BasicTabbedPaneUI {

    private static final Insets NO_INSETS = new Insets(2, 0, 0, 0);

    /**
     * The font to use for the selected tab
     */
    private Font boldFont;

    /**
     * The font metrics for the selected font
     */
    private FontMetrics boldFontMetrics;

    /**
     * The color to use to fill in the background
     */
    private Color fillColor;

    // ------------------------------------------------------------------------------------------------------------------
    //  Custom installation methods
    // ------------------------------------------------------------------------------------------------------------------
    public static ComponentUI createUI(JComponent c) {
        return new GMPTabbedPaneUI2();
    }

    @Override
    public void installDefaults() {
        super.installDefaults();
        tabAreaInsets.left = 4;
        selectedTabPadInsets = new Insets(0, 0, 0, 0);
        tabInsets = selectedTabPadInsets;

        Color background = tabPane.getBackground();
        fillColor = background.darker();

        boldFont = tabPane.getFont().deriveFont(Font.BOLD);
        boldFontMetrics = tabPane.getFontMetrics(boldFont);
    }

    // ------------------------------------------------------------------------------------------------------------------
    //  Custom sizing methods
    // ------------------------------------------------------------------------------------------------------------------
    @Override
    public int getTabRunCount(JTabbedPane pane) {
        return 1;
    }

    @Override
    public Insets getContentBorderInsets(int tabPlacement) {
        return NO_INSETS;
    }

    @Override
    public int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        int vHeight = fontHeight;
        if (vHeight % 2 > 0) {
            vHeight += 1;
        }
        return vHeight;
    }

    @Override
    public int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return super.calculateTabWidth(tabPlacement, tabIndex, metrics) + metrics.getHeight();
    }

    // ------------------------------------------------------------------------------------------------------------------
    //  Custom painting methods
    // ------------------------------------------------------------------------------------------------------------------
    // ------------------------------------------------------------------------------------------------------------------
    //  Methods that we want to suppress the behaviour of the superclass
    // ------------------------------------------------------------------------------------------------------------------
    @Override
    public void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        Polygon shape = new Polygon();

        shape.addPoint(x, y + h);
        shape.addPoint(x, y);
        shape.addPoint(x + w - (h / 2), y);

        if (isSelected || (tabIndex == (rects.length - 1))) {
            shape.addPoint(x + w + (h / 2), y + h);
        } else {
            shape.addPoint(x + w, y + (h / 2));
            shape.addPoint(x + w, y + h);
        }

        g.setColor(tabPane.getBackground());
        g.fillPolygon(shape);
    }

    @Override
    public void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x, y + h);
        g.drawLine(x, y, x + w - (h / 2), y);
        g.drawLine(x + w - (h / 2), y, x + w + (h / 2), y + h);

        if (isSelected) {
            g.setColor(Color.WHITE);
            g.drawLine(x + 1, y + 1, x + 1, y + h);
            g.drawLine(x + 1, y + 1, x + w - (h / 2), y + 1);

            g.setColor(shadow);
            g.drawLine(x + w - (h / 2), y + 1, x + w + (h / 2) - 1, y + h);
        }
    }

    @Override
    public void paintContentBorderTopEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
        Rectangle selectedRect = selectedIndex < 0 ? null : getTabBounds(selectedIndex, calcRect);

        selectedRect.width = selectedRect.width + (selectedRect.height / 2) - 1;

        g.setColor(Color.BLACK);

        g.drawLine(x, y, selectedRect.x, y);
        g.drawLine(selectedRect.x + selectedRect.width + 1, y, x + w, y);

        g.setColor(Color.WHITE);

        g.drawLine(x, y + 1, selectedRect.x, y + 1);
        g.drawLine(selectedRect.x + 1, y + 1, selectedRect.x + 1, y);
        g.drawLine(selectedRect.x + selectedRect.width + 2, y + 1, x + w, y + 1);

        g.setColor(shadow);
        g.drawLine(selectedRect.x + selectedRect.width, y, selectedRect.x + selectedRect.width + 1, y + 1);
    }

    @Override
    public void paintContentBorderRightEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
        // Do nothing
    }

    @Override
    public void paintContentBorderLeftEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
        // Do nothing
    }

    @Override
    public void paintContentBorderBottomEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
        // Do nothing
    }

    @Override
    public void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
        // Do nothing
    }

    @Override
    public void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
        int tw = tabPane.getBounds().width;

        g.setColor(fillColor);
        g.fillRect(0, 0, tw, rects[0].height + 3);

        super.paintTabArea(g, tabPlacement, selectedIndex);
    }

    @Override
    public void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected) {
        if (isSelected) {
            int vDifference = (int) (boldFontMetrics.getStringBounds(title, g).getWidth()) - textRect.width;
            textRect.x -= (vDifference / 2);
            super.paintText(g, tabPlacement, boldFont, boldFontMetrics, tabIndex, title, textRect, isSelected);
        } else {
            super.paintText(g, tabPlacement, font, metrics, tabIndex, title, textRect, isSelected);
        }
    }

    @Override
    public int getTabLabelShiftY(int tabPlacement, int tabIndex, boolean isSelected) {
        return 0;
    }
}
