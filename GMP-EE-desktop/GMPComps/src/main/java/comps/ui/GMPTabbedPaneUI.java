package comps.ui;

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
public class GMPTabbedPaneUI extends BasicTabbedPaneUI {

    private static final Insets TAB_INSETS = new Insets(1, 0, 0, 0);

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
    private Color selectedColor;

    /**
     * The color to use to fill in the background
     */
    private Color unselectedColor;

    // ------------------------------------------------------------------------------------------------------------------
    //  Custom installation methods
    // ------------------------------------------------------------------------------------------------------------------
    public static ComponentUI createUI(JComponent c) {
        return new GMPTabbedPaneUI();
    }

    @Override
    public void installDefaults() {
        super.installDefaults();
        tabAreaInsets.left = (calculateTabHeight(0, 0, tabPane.getFont().getSize()) / 4) + 1;
        selectedTabPadInsets = new Insets(0, 0, 0, 0);

        selectedColor = Color.WHITE;
        unselectedColor = tabPane.getBackground().darker();

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
        return TAB_INSETS;
    }

    @Override
    public int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        int vHeight = fontHeight + 2;
        if (vHeight % 2 == 0) {
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

        shape.addPoint(x - (h / 4), y + h);
        shape.addPoint(x + (h / 4), y);
        shape.addPoint(x + w - (h / 4), y);

        if (isSelected || (tabIndex == (rects.length - 1))) {
            if (isSelected) {
                g.setColor(selectedColor);
            } else {
                g.setColor(unselectedColor);
            }
            shape.addPoint(x + w + (h / 4), y + h);
        } else {
            g.setColor(unselectedColor);
            shape.addPoint(x + w, y + (h / 2));
            shape.addPoint(x + w - (h / 4), y + h);
        }

        g.fillPolygon(shape);
    }

    @Override
    public void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        g.setColor(darkShadow);
        g.drawLine(x - (h / 4), y + h, x + (h / 4), y);
        g.drawLine(x + (h / 4), y, x + w - (h / 4), y);
        g.drawLine(x + w - (h / 4), y, x + w + (h / 4), y + h);
    }

    @Override
    public void paintContentBorderTopEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
        Rectangle selectedRect = selectedIndex < 0 ? null : getTabBounds(selectedIndex, calcRect);
        g.setColor(darkShadow);
        g.drawLine(x, y, selectedRect.x - (selectedRect.height / 4), y);
        g.drawLine(selectedRect.x + selectedRect.width + (selectedRect.height / 4), y, x + w, y);
        g.setColor(selectedColor);
        g.drawLine(selectedRect.x - (selectedRect.height / 4) + 1, y, selectedRect.x + selectedRect.width + (selectedRect.height / 4) - 1, y);

    }

    @Override
    public void paintContentBorderRightEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {

    }

    @Override
    public void paintContentBorderLeftEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {

    }

    @Override
    public void paintContentBorderBottomEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {

    }

    @Override
    public void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
        // Do nothing
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
