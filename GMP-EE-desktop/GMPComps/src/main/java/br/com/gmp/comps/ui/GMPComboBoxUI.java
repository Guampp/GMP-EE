package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author kaciano
 */
public class GMPComboBoxUI extends BasicComboBoxUI {

    private Color startColor = BaseColors.darkColor.darker();
    private Color endColor = BaseColors.darkColor;
    private Color disabledColor = new Color(192, 192, 192);
    private Color normalColor = Color.white;
    private Color highlightColor = BaseColors.systemColor;
    private GradientPaint GP;

    public static ComponentUI createUI(JComponent c) {
        return new GMPComboBoxUI();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
//        c.setFont(new Font("Verdana", 0, 14));
//        Graphics2D g2d = (Graphics2D) g.create();
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//                RenderingHints.VALUE_ANTIALIAS_ON);
//        int h = c.getHeight();
//        int w = c.getWidth();
//        if (!c.isEnabled()) {
//            c.setForeground(Color.GRAY);
//            GP = new GradientPaint(0, 0, disabledColor, 0, h, disabledColor, true);
//        } else {
//            c.setForeground(normalColor);
//        }
//        g2d.setPaint(GP);
//        GradientPaint p1;
//        GradientPaint p2;
//        p1 = new GradientPaint(0, 0, new Color(100, 100, 100), 0, h - 1,
//                new Color(0, 0, 0));
//        p2 = new GradientPaint(0, 1, new Color(255, 255, 255, 100), 0,
//                h - 3, new Color(0, 0, 0, 50));
//        GP = new GradientPaint(0, 0, startColor, 0, h, endColor, true);
//        Rectangle2D.Float r2d = new Rectangle2D.Float(0, 0, w - 1, h - 1);
//        Shape clip = g2d.getClip();
//        g2d.clip(r2d);
//        g2d.fillRect(0, 0, w, h);
//        g2d.setClip(clip);
//        g2d.setPaint(p1);
//        g2d.drawRect(0, 0, w - 1, h - 1);
//        g2d.setPaint(p2);
//        g2d.drawRect(1, 1, w - 3, h - 3);
//        g2d.dispose();
        super.paint(g, c);
    }

    @Override
    protected JButton createArrowButton() {
        JButton button = new BasicArrowButton(BasicArrowButton.SOUTH,
                Color.gray, Color.gray, Color.gray.brighter(), Color.gray);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
        });
        return button;
    }
}
