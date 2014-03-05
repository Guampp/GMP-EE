package br.com.gmp.comps.table;

import br.com.gmp.comps.BaseColors;
import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.model.GMPTableModel;
import br.com.gmp.comps.table.interfaces.TableControl;
import br.com.gmp.utils.collections.CollectionUtil;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 * Tabela customizada
 *
 * @author kaciano
 * @param <T>
 */
public class GMPTable extends JTable implements TableControl {

    private int pageCount;
    private int actualPage;
    private int maxRows;
    private List[] pages;
    private GMPTableModel gmpModel;
    private Color startHeaderColor;
    private Color endHeaderColor;

    /**
     *
     */
    public GMPTable() {
        this.gmpModel = new GMPTableModel(TableObject.class);
        this.pageCount = 0;
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
     * @param maxRows
     * @param gmpModel
     */
    public GMPTable(int maxRows, GMPTableModel gmpModel) {
        this.maxRows = maxRows;
        this.gmpModel = gmpModel;
        initialize();
    }

    /**
     *
     * @param maxRows
     * @param gmpModel
     * @param startHeaderColor
     * @param endHeaderColor
     */
    public GMPTable(int maxRows, GMPTableModel gmpModel, Color startHeaderColor, Color endHeaderColor) {
        this.pageCount = maxRows;
        this.gmpModel = gmpModel;
        this.startHeaderColor = startHeaderColor;
        this.endHeaderColor = endHeaderColor;
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
        initialize();
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
        initialize();
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
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row,
                    int column) {
                JCheckBox check = new JCheckBox("", (Boolean) value);
                check.setAlignmentX(CENTER_ALIGNMENT);
                //--------------------------------------------------------------
                // Par e não selecionado
                if (row % 2 == 0 && !isCellSelected(row, column)) {
                    check.setOpaque(true);
                    check.setBackground(BaseColors.alternativeRowColor);
                }
                //--------------------------------------------------------------
                // Selecionado
                if (isCellSelected(row, column)) {
                    check.setOpaque(true);
                    check.setBackground(getSelectionBackground());
                }
                //--------------------------------------------------------------
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
    public void nextPage() {
        if (actualPage < (pageCount - 1)) {
            setActualPage(actualPage + 1);
        } else {
            new BalloonUtil().showBallon(this, "Esta é a ultima pagina");
        }
    }

    @Override
    public void previousPage() {
        if (actualPage != 0) {
            setActualPage(actualPage - 1);
        } else {
            new BalloonUtil().showBallon(this, "Esta é a primeira pagina");
        }
    }

    @Override
    public int getMaxRows() {
        return this.maxRows;
    }

    @Override
    public void setMaxRows(int maxrows) {
        this.maxRows = maxrows;
    }

    @Override
    public int getActualPage() {
        return this.actualPage;
    }

    @Override
    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }

    @Override
    public void gotoPage(int page) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Divide a lista principal em listas menores para gerar as páginas
     *
     * @param list <code><b>List</b><?></code> Lista com os dados da tabela
     */
    private void splitData(List<?> list) {
        if (maxRows != 0) {
            this.pages = new CollectionUtil().splitList(list, maxRows);
        } else {
            this.pages = new ArrayList[1];
            this.pages[0] = list;
        }
    }

    /**
     * Monta a tabela
     *
     * @param objectclass <code><b>Class</b><\/></code> Classe a ser mapeada
     * @param list <code><b>List</b><?></code> Lista com os dados da tabela
     */
    public void mount(Class<?> objectclass, List<?> list) {
        this.setModel(new GMPTableModel(objectclass, list));
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
