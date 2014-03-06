package br.com.gmp.comps.table.paginated;

import br.com.gmp.comps.model.GMPTableModel;
import br.com.gmp.comps.table.GMPTable;
import br.com.gmp.comps.table.interfaces.TableSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Tabela de paginação automatica
 *
 * @author kaciano
 * @version 1.0
 * @see br.com.gmp.comps.table.GMPTable
 * @see br.com.gmp.comps.table.bar.GMPTableBar
 */
public class GMPPaginatedTable extends javax.swing.JPanel {

    private int maxRows;
    private TableSource source;
    private final GMPTableModel gmpModel;
    private final Class objClass;

    /**
     *
     */
    public GMPPaginatedTable() {
        this.source = new TableSource() {
            @Override
            public List getTableData() {
                return new ArrayList();
            }
        };
        this.maxRows = 0;
        this.objClass = PageObject.class;
        this.gmpModel = new PageModel(objClass, new ArrayList());
        initComponents();
    }

    /**
     * Creates new form GMPPaginatedTable
     *
     * @param source
     * @param maxrows
     */
    public GMPPaginatedTable(TableSource source, int maxrows) {
        this.source = source;
        this.maxRows = maxrows;
        this.objClass = PageObject.class;
        this.gmpModel = new PageModel(objClass, new ArrayList());
        initComponents();
    }

    /**
     * Creates new form GMPPaginatedTable
     *
     * @param source
     * @param maxRows
     * @param gmpModel
     * @param objClass
     */
    public GMPPaginatedTable(TableSource source, int maxRows, GMPTableModel gmpModel, Class objClass) {
        this.source = source;
        this.maxRows = maxRows;
        this.gmpModel = gmpModel;
        this.objClass = objClass;
        initComponents();        
    }

    /**
     * Retorna a tabela
     *
     * @return <code>GMPTable</code> Tabela
     */
    public GMPTable getTable() {
        return gTable;
    }

    /**
     * Modifica a tabela
     *
     * @param table <code>GMPTable</code> Tabela
     */
    public void setTable(GMPTable table) {
        this.gTable = table;
    }

    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gTableBar = new br.com.gmp.comps.table.bar.GMPTableBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        gTable = new br.com.gmp.comps.table.GMPTable(source, maxRows, gmpModel, objClass);

        gTableBar.setTable(gTable);

        jScrollPane1.setViewportView(gTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gTableBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gTableBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.table.GMPTable gTable;
    private br.com.gmp.comps.table.bar.GMPTableBar gTableBar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

class PageObject {

    private String a;
    private String b;
    private String c;

    public PageObject(String a, String b, String c) {
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

class PageModel extends GMPTableModel<PageObject> {

    public PageModel(Class<PageObject> objClass, List<PageObject> list) {
        super(objClass, list);
    }

}
