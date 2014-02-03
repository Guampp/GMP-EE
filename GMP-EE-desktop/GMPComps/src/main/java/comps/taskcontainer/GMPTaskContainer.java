/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comps.taskcontainer;

import comps.BaseColors;
import comps.BaseColors;
import comps.ui.GMPTaskPaneUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.JXTaskPaneContainer;

/**
 *
 * @author kaciano
 */
public class GMPTaskContainer extends JXTaskPaneContainer {

    private Color color;
    private final Color defaultColor = BaseColors.systemColor;
    private static final Color staticColor = BaseColors.systemColor;

    public GMPTaskContainer() {
        initComponents();
    }

    public GMPTaskContainer(Color highlight) {
        this.color = highlight;
        initComponents();
    }

    public GMPTaskContainer(ArrayList<JXTaskPane> tasks) {
        initComponents();
        for (JXTaskPane task : tasks) {
            this.add(task);
            this.revalidate();
            this.repaint();
        }
        for (Component c : this.getComponents()) {
            JXTaskPane task;
            task = (JXTaskPane) c;
            task.setUI(new GMPTaskPaneUI(color != null ? color : defaultColor));
            task.addMouseListener(ml);
            task.setCollapsed(true);
        }
    }

    public void addCustomTask(JXTaskPane task) {
        this.add(task);
        task.setUI(new GMPTaskPaneUI(color != null ? color : defaultColor));
        task.addMouseListener(ml);
        task.setCollapsed(true);
        this.revalidate();
        this.repaint();
    }

    public void setList(ArrayList<JXTaskPane> tasks) {
        for (JXTaskPane task : tasks) {
            this.add(task);
        }
        for (Component c : this.getComponents()) {
            JXTaskPane task;
            task = (JXTaskPane) c;
            task.setUI(new GMPTaskPaneUI(color != null ? color : defaultColor));
            task.addMouseListener(ml);
            task.setCollapsed(true);
        }
    }
    MouseListener ml = new MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent me) {
            JXTaskPane task;
            for (Component c : getComponents()) {
                if (c instanceof JXTaskPane) {
                    task = (JXTaskPane) c;
                    if (task != me.getComponent()) {
                        task.setCollapsed(true);
                    }
                }
            }
        }
    };

    public static void generateCustomTask(final JXTaskPane parent, JXTaskPane task) {
        task.setUI(new GMPTaskPaneUI(BaseColors.systemColor));
        task.setCollapsed(true);
        task.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent me) {
                JXTaskPane t;
                for (Component c : parent.getComponents()) {
                    if (c instanceof JXTaskPane) {
                        t = (JXTaskPane) c;
                        if (t != me.getComponent()) {
                            t.setCollapsed(true);
                        }
                    }
                }
            }
        });        
    }

    public static void generateCustomTask(final GMPTaskContainer parent, JXTaskPane task) {
        task.setUI(new GMPTaskPaneUI(BaseColors.systemColor));
        task.setCollapsed(true);
        task.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent me) {
                JXTaskPane t;
                for (Component c : parent.getComponents()) {
                    if (c instanceof JXTaskPane) {
                        t = (JXTaskPane) c;
                        if (t != me.getComponent()) {
                            t.setCollapsed(true);
                        }
                    }
                }
            }
        });        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(153, 153, 153));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        setLayout(verticalLayout1);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
