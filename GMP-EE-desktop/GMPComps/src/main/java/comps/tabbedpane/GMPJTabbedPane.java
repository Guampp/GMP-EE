/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comps.tabbedpane;

import comps.BaseColors;
import comps.button.ButtonTabComponent;
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

    Component locked;

    public GMPJTabbedPane() {
        initComponents();
        changeTabbedPane();
    }

    public GMPJTabbedPane(Component locked) {
        this.locked = locked;
        initComponents();
        changeTabbedPane();
    }

    private void changeTabbedPane() {
        UIManager.put("TabbedPane.borderColor", BaseColors.darkColor);
        UIManager.put("TabbedPane.darkShadow", BaseColors.darkColor);
        UIManager.put("TabbedPane.light", BaseColors.lightColor);
        UIManager.put("TabbedPane.highlight", BaseColors.lightColor);
        UIManager.put("TabbedPane.focus", BaseColors.lightColor);
        UIManager.put("TabbedPane.selected", BaseColors.systemColor);
        UIManager.put("TabbedPane.unselectedBackground", BaseColors.lightColor);
        UIManager.put("TabbedPane.selectHighlight", BaseColors.lightColor);
        UIManager.put("TabbedPane.borderHightlightColor", BaseColors.lightColor);
        UIManager.put("TabbedPane.contentBorderInsets", new Insets(1, 1, 1, 1));
    }
    //==========================================================================
    //    
    //<editor-fold desc="Determinar componente com lock" defaultstate="collapsed">    

    public void setLocked(Component locked) {
        this.locked = locked;
    }
    //</editor-fold>      
    //==========================================================================
    //    
    //<editor-fold desc="Retorna o index do componente" defaultstate="collapsed">    

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
    //</editor-fold>  
    //==========================================================================
    //    
    //<editor-fold desc="Adicionar tab removivel" defaultstate="collapsed">    

    public void addClosableTab(String title, Icon icon, Component component, String tooltip) {
        this.addTab(title, icon, component, tooltip);
        int index = getComponentTabIndex(component);
        this.setTabComponentAt(index, new ButtonTabComponent(this, icon));
    }
    //</editor-fold>  
    //==========================================================================
    //    
    //<editor-fold desc="Remover tab" defaultstate="collapsed">    

    public void removeTab(MouseEvent evt) {
        Component selected = this.getSelectedComponent();
        if (selected != null && !selected.equals(locked)
                && evt.getButton() == MouseEvent.BUTTON2) {
            this.remove(selected);
        }
    }
    //</editor-fold>     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
