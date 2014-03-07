package br.com.gmp.comps.table;

import br.com.gmp.comps.BaseColors;
import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.model.GMPTableModel;
import br.com.gmp.comps.table.interfaces.TableControl;
import br.com.gmp.comps.table.interfaces.TableSource;
import br.com.gmp.utils.collections.CollectionUtil;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.Color;
import javax.swing.SwingConstants;

/**
 * Tabela customizada
 *
 * @author kaciano
 * @version 1.0
 * @param <T> Tipo de objeto da tabela
 * @see javax.swing.JTable
 */
public class GMPTable<T> extends JTable implements TableControl {

    private Class objClass;
    private TableSource source;
    private int pageCount;
    private int actualPage;
    private int maxRows;
    private List<T> mainList;
    private List<T>[] pages;
    private GMPTableModel gmpModel;

    /**
     * Cria nova instancia de GMPTable
     */
    public GMPTable() {
        this.objClass = TableObject.class;
        this.source = new TableSource() {
            @Override
            public List<TableObject> getTableData() {
                return new ArrayList<>();
            }
        };
        mainList = source.getTableData();
        this.gmpModel = new GMPTableModel(objClass);
        this.pageCount = 0;
        setModel(gmpModel);
        initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source <code>TableSource<code> Fonte de dados
     * @param objClass <code><b>Class</b><T></code> Classe a ser mapeada
     */
    public GMPTable(TableSource source, Class objClass) {
        this.source = source;
        this.objClass = objClass;
        this.mainList = source.getTableData();
        this.gmpModel = new GMPTableModel(objClass);
        this.maxRows = 0;
        this.pageCount = 0;
        setModel(gmpModel);
        initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source <code>TableSource<code> Fonte de dados
     * @param model <code>GMPTableModel</code> Modelo da tabela
     * @param objClass <code><b>Class</b><T></code> Classe a ser mapeada
     */
    public GMPTable(TableSource source, GMPTableModel model, Class objClass) {
        this.source = source;
        this.mainList = source.getTableData();
        this.maxRows = 0;
        this.gmpModel = model;
        this.setModel(model);
        initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source <code>TableSource<code> Fonte de dados
     * @param maxRows <code>Integer</code> Numero máximo de linhas
     * @param gmpModel <code>GMPTableModel</code> Modelo da tabela
     * @param objClass <code><b>Class</b><T></code> Classe a ser mapeada
     */
    public GMPTable(TableSource source, int maxRows, GMPTableModel gmpModel, Class objClass) {
        this.source = source;
        this.mainList = source.getTableData();
        this.maxRows = maxRows;
        this.gmpModel = gmpModel;
        this.objClass = objClass;
        initialize();
    }

    /**
     * Metodo de inicialização
     */
    private void initialize() {
        initComponents();
        this.setSelectionBackground(BaseColors.systemColor);
        this.setShowGrid(true);
        this.setGridColor(Color.gray.darker());
        this.setDefaultEditor(Boolean.TYPE, new DefaultCellEditor(new JCheckBox()));
        this.setDefaultRenderer(Boolean.TYPE, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row,
                    int column) {
                JCheckBox check = new JCheckBox("", (Boolean) value);
                check.setHorizontalAlignment(SwingConstants.CENTER);
                check.setHorizontalTextPosition(SwingConstants.CENTER);
                //--------------------------------------------------------------
                // Par e não selecionado
                if (row % 2 == 0 && !isCellSelected(row, column)) {
                    check.setOpaque(true);
                    check.setBackground(Color.lightGray);
                }
                //--------------------------------------------------------------
                // Selecionado
                if (isCellSelected(row, column)) {
                    check.setHorizontalAlignment(SwingConstants.CENTER);
                    check.setHorizontalTextPosition(SwingConstants.CENTER);
                    check.setOpaque(true);
                    check.setBackground(getSelectionBackground());
                }
                //--------------------------------------------------------------
                // Impar e não selecionado
                if (!(row % 2 == 0) && !isCellSelected(row, column)) {
                    check.setHorizontalAlignment(SwingConstants.CENTER);
                    check.setHorizontalTextPosition(SwingConstants.CENTER);
                    check.setOpaque(true);
                    check.setBackground(getBackground());
                }
                return check;
            }
        });
        //----------------------------------------------------------------------
        refresh();
    }

    @Override
    public void refresh() {
        this.mainList = source.getTableData();
        this.splitData(mainList);
        this.setActualPage(0);
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
        this.getGmpModel().setList(pages[actualPage]);
    }

    @Override
    public void gotoPage(int page) {
        this.setActualPage(page);
    }

    @Override
    public void gotoFirst() {
        this.setActualPage(0);
    }

    @Override
    public void gotoLast() {
        if (pages != null) {
            this.setActualPage(pages.length > 0 ? (pages.length - 1) : 0);
        }
    }

    public void setTable(TableSource source, int maxRows, GMPTableModel gmpModel, Class objClass) {
        this.source = source;
        this.mainList = source.getTableData();
        this.maxRows = maxRows;
        this.gmpModel = gmpModel;
        this.objClass = objClass;
        this.refresh();
        this.repaint();
        this.revalidate();
    }

    /**
     * Divide a lista principal em listas menores para gerar as páginas
     *
     * @param list <code><b>List</b><T></code> Lista com os dados da tabela
     */
    private void splitData(List<T> list) {
        if (maxRows != 0) {
            this.pages = new CollectionUtil().splitList(list, maxRows);
        } else {
            this.pages = new ArrayList[1];
            this.pages[0] = list;
        }
        setActualPage(0);
    }

    /**
     * Monta a tabela
     *
     * @param objectclass <code><b>Class</b><T></code> Classe a ser mapeada
     * @param list <code><b>List</b><T></code> Lista com os dados da tabela
     */
    public void mount(Class<T> objectclass, List<T> list) {
        this.setModel(new GMPTableModel(objectclass, list));
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        if (row % 2 == 0 && !isCellSelected(row, column)) {
            c.setBackground(Color.lightGray);
        } else if (isCellSelected(row, column)) {
            c.setBackground(getSelectionBackground());
        } else {
            c.setBackground(getBackground());
        }
        return c;
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna a classe dos objetos mapeados
     *
     * @return <code><b>Class</b><T></code> Classe mapeada
     */
    public Class getObjClass() {
        return objClass;
    }

    /**
     * Retorna o modelo da tabela
     *
     * @return <code>GMPTableModel</code> Modelo da tabela
     */
    public GMPTableModel getGmpModel() {
        return gmpModel;
    }

    /**
     * Modifica o modelo da tabela
     *
     * @param gmpModel <code>GMPTableModel</code> Modelo da tabela
     */
    public void setGmpModel(GMPTableModel gmpModel) {
        this.gmpModel = gmpModel;
    }

    /**
     * Retorna a fonte de dados
     *
     * @return <code>TableSource<code> Fonte de dados
     */
    public TableSource getSource() {
        return source;
    }

    /**
     * Modifica a fonte de dados
     *
     * @param source <code>TableSource<code> Fonte de dados
     */
    public void setSource(TableSource source) {
        this.source = source;
    }

    /**
     * Retorna a quantidade de páginas
     *
     * @return <code>int</code> Quantidade de páginas
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Retorna as páginas
     *
     * @return <code>List[]</code> Array de listas das páginas
     */
    public List[] getPages() {
        return pages;
    }

    /**
     * Modifica as páginas
     *
     * @param pages <code>List[]</code> Array de listas das páginas
     */
    public void setPages(List[] pages) {
        this.pages = pages;
    }

    //</editor-fold>
    /**
     * Código gerado automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
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
