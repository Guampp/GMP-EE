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
import javax.swing.table.TableCellRenderer;

/**
 * Tabela customizada
 *
 * @author kaciano
 */
public class GMPTable extends JTable {

    private GMPTableModel gmpModel;
    private Color startHeaderColor;
    private Color endHeaderColor;

    /**
     *
     */
    public GMPTable() {
        this.gmpModel = new GMPTableModel(TableObject.class);
        setModel(gmpModel);
        initialize();
    }

    /**
     *
     * @param model
     */
    public GMPTable(GMPTableModel model) {
        this.gmpModel = model;
        this.setModel(model);
        initialize();
    }

    /**
     *
     * @param startHeaderColor
     * @param endHeaderColor
     */
    public GMPTable(Color startHeaderColor, Color endHeaderColor) {
        this.gmpModel = new GMPTableModel(TableObject.class);
        this.startHeaderColor = startHeaderColor;
        this.endHeaderColor = endHeaderColor;
    }

    /**
     *
     * @param gmpModel
     * @param startHeaderColor
     * @param endHeaderColor
     */
    public GMPTable(GMPTableModel gmpModel, Color startHeaderColor, Color endHeaderColor) {
        this.gmpModel = gmpModel;
        this.startHeaderColor = startHeaderColor;
        this.endHeaderColor = endHeaderColor;
    }

    /**
     * Metodo de inicialização
     */
    private void initialize() {
        initComponents();
        //this.getTableHeader().setUI(new MyTableHeaderUI());
        this.setSelectionBackground(BaseColors.systemColor);
        this.setShowGrid(true);
        this.setGridColor(BaseColors.darkColor.darker());
        this.setDefaultEditor(Boolean.TYPE, new DefaultCellEditor(new JCheckBox()));
        this.setDefaultRenderer(Boolean.TYPE, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox check = new JCheckBox("", (Boolean) value);
                check.setAlignmentX(CENTER_ALIGNMENT);
                // Par e não selecionado
                if (row % 2 == 0 && !isCellSelected(row, column)) {
                    check.setOpaque(true);
                    check.setBackground(BaseColors.alternativeRowColor);
                }
                // Selecionado
                if (isCellSelected(row, column)) {
                    check.setOpaque(true);
                    check.setBackground(getSelectionBackground());
                }
                // Impar e não selecionado
                if (!(row % 2 == 0) && !isCellSelected(row, column)) {
                    check.setOpaque(true);
                    check.setBackground(getBackground());
                }
                return check;
            }
        });
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        if (row % 2 == 0 && !isCellSelected(row, column)) {
            c.setBackground(BaseColors.alternativeRowColor);
        } else if (isCellSelected(row, column)) {
            c.setBackground(getSelectionBackground());
        } else {
            c.setBackground(getBackground());
        }
        return c;
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

class TableObject {

    private String a;
    private String b;
    private String c;

    public TableObject(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return a + b + c;
    }

}
