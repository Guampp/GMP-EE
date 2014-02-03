package comps.table;

import comps.BaseColors;
import comps.model.GMPTableModel;
import comps.ui.MyTableHeaderUI;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author kaciano
 */
public class GMPTable extends JTable {

    private GMPTableModel gmpModel;

    public GMPTable() {
        gmpModel = new GMPTableModel(new Object());
        setModel(gmpModel);
        initialize();
    }

    public GMPTable(GMPTableModel model) {
        this.gmpModel = model;
        this.setModel(model);
        initialize();
    }

    private void initialize() {
        initComponents();
        this.getTableHeader().setUI(new MyTableHeaderUI());
        this.setSelectionBackground(BaseColors.systemColor);
        this.setShowGrid(true);
        this.setGridColor(BaseColors.lightColor);
        this.setRowHeight(25);
        this.setDefaultEditor(Boolean.TYPE, new DefaultCellEditor(new JCheckBox()));
        this.setDefaultRenderer(Boolean.TYPE, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                return new JCheckBox();
            }            
        });                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public GMPTableModel getGmpModel() {
        return gmpModel;
    }

    public void setGmpModel(GMPTableModel gmpModel) {
        this.gmpModel = gmpModel;
    }
}
