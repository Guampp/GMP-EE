package br.com.gmp.comps.table;

import br.com.gmp.comps.BaseColors;
import br.com.gmp.comps.model.GMPTableModel;
import br.com.gmp.comps.ui.MyTableHeaderUI;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Tabela customizada
 *
 * @author kaciano
 */
public class GMPTable extends JTable {

    private GMPTableModel gmpModel;
    private Color startHeaderColor;
    private Color endHeaderColor;

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

    public GMPTable(Color startHeaderColor, Color endHeaderColor) {
        gmpModel = new GMPTableModel(new Object());
        this.startHeaderColor = startHeaderColor;
        this.endHeaderColor = endHeaderColor;
    }

    public GMPTable(GMPTableModel gmpModel, Color startHeaderColor, Color endHeaderColor) {
        this.gmpModel = gmpModel;
        this.startHeaderColor = startHeaderColor;
        this.endHeaderColor = endHeaderColor;
    }

    private void initialize() {
        initComponents();
        this.getTableHeader().setUI(new MyTableHeaderUI());
        this.setSelectionBackground(BaseColors.systemColor);
        this.setShowGrid(true);
        this.setGridColor(BaseColors.lightColor);
        this.setRowHeight(25);
        this.setDefaultEditor(Boolean.TYPE, new DefaultCellEditor(new JCheckBox()));
        this.setDefaultRenderer(Boolean.TYPE, new DefaultTableCellRenderer() {
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

    public Color getStartHeaderColor() {
        return startHeaderColor;
    }

    public void setStartHeaderColor(Color startHeaderColor) {
        this.startHeaderColor = startHeaderColor;
    }

    public Color getEndHeaderColor() {
        return endHeaderColor;
    }

    public void setEndHeaderColor(Color endHeaderColor) {
        this.endHeaderColor = endHeaderColor;
    }

}
