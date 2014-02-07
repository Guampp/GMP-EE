package comps.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author kaciano
 */
public class GMPTabbedPaneUI extends BasicTabbedPaneUI {

    private Color selectColor;
    private Color deSelectColor;
    private int i1;
    private int i2;
    private int i3;
    private int i4;

    /**
     * Cria nova instancia de GMPTabbedPaneUI
     */
    public GMPTabbedPaneUI() {
        this.i1 = 1;
        this.i2 = 1;
        this.i3 = 1;
        this.i4 = 1;
        selectColor = new Color(1, 113, 215);
        deSelectColor = new Color(51, 153, 255);
    }

    /**
     * Cria nova instancia de GMPTabbedPaneUI
     *
     * @param i1 Espessura da borda no topo
     * @param i2 Espessura da borda na esquerda
     * @param i3 Espessura da borda na base
     * @param i4 Espessura da borda na direita
     */
    public GMPTabbedPaneUI(int i1, int i2, int i3, int i4) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        selectColor = new Color(1, 113, 215);
        deSelectColor = new Color(51, 153, 255);
    }

    /**
     * Cria nova instancia de GMPTabbedPaneUI
     *
     * @param selectColor Cor quando selecionado
     * @param deSelectColor Cor quando não selecionado
     * @param i1 Espessura da borda no topo
     * @param i2 Espessura da borda na esquerda
     * @param i3 Espessura da borda na base
     * @param i4 Espessura da borda na direita
     */
    public GMPTabbedPaneUI(Color selectColor, Color deSelectColor, int i1, int i2, int i3, int i4) {
        this.selectColor = selectColor;
        this.deSelectColor = deSelectColor;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        contentBorderInsets = new InsetsUIResource(i1, i2, i3, i4);
        tabInsets = new InsetsUIResource(1, 2, 1, 2);

    }

    @Override
    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        return super.calculateTabHeight(tabPlacement, tabIndex, fontHeight) + 5;
    }

    @Override
    protected void paintTab(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect) {
        Color savedColor = g.getColor();
        //Graphics2D g2D = (Graphics2D) g;
        int x = rects[tabIndex].x;
        int y = rects[tabIndex].y;
        int w = rects[tabIndex].width;
        int h = rects[tabIndex].height;
//        GradientPaint gp = new GradientPaint(x, y, selectColor, w, h, deSelectColor, true);
//        GradientPaint gp2 = new GradientPaint(x, y, deSelectColor, w, h, selectColor, true);
        int selected = tabPane.getSelectedIndex();
        if (selected == tabIndex) {
            g.setColor(TabbedColors.selectColor);
            g.fillRect(x, y, w, h);
            //g2D.setPaint(gp);
        } else {
            g.setColor(TabbedColors.deSelectColor);
            g.fillRect(x, y, w, h);
            //g2D.setPaint(gp2);
        }
        g.setColor(Color.BLUE);
        g.drawRect(x, y, w, h);
        g.setColor(savedColor);
        //g2D.dispose();
    }

    public Color getSelectColor() {
        return selectColor;
    }

    public void setSelectColor(Color selectColor) {
        this.selectColor = selectColor;
    }

    public Color getDeSelectColor() {
        return deSelectColor;
    }

    public void setDeSelectColor(Color deSelectColor) {
        this.deSelectColor = deSelectColor;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public int getI3() {
        return i3;
    }

    public void setI3(int i3) {
        this.i3 = i3;
    }

    public int getI4() {
        return i4;
    }

    public void setI4(int i4) {
        this.i4 = i4;
    }

}

/**
 *
 * @author kaciano
 */
class TabbedColors {

    public static final Color selectColor = new Color(1, 113, 215);
    public static final Color deSelectColor = new Color(51, 153, 255);

}
