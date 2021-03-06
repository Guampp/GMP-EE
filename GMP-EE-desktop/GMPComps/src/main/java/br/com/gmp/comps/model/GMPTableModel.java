package br.com.gmp.comps.model;

import br.com.gmp.comps.annotations.ColumnName;
import java.lang.reflect.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.table.AbstractTableModel;

/**
 * Modelo de tabelas padrão para GMPTables. Funcional para todas as JTables,
 * desde que esteja configurado corretamente
 *
 * Exemplo de uso:
 * <br><code>
 * class NewTableModel extends GMPTableModel<<b>Object</b>> {<br>
 * public NewTableModel() {<br>
 * super(<b>Object</b>.class)<br>
 * }<br>
 * }<br>
 * </code><br>
 *
 * @author kaciano
 * @version 1.1
 * @param <T> Tipo de objeto a ser mapeado
 * @see javax.swing.table.TableModel
 */
public class GMPTableModel<T> extends AbstractTableModel {

    private Class<T> objClass;
    private String[] columns = null;
    private List<T> list;

    /**
     * Cria novo GMPTableModel
     *
     * @param objClass <code><b>Class</b><T></code> Classe a ser mapeada
     */
    public GMPTableModel(Class<T> objClass) {
        initialize(objClass, null);
    }

    /**
     * Cria novo GMPTableModel
     *
     * @param objClass <code><b>Class</b><T></code> Classe a ser mapeada
     * @param list <code><b>List</b><T></code> Lista de objetos
     */
    public GMPTableModel(Class<T> objClass, List<T> list) {
        initialize(objClass, list);
    }

    /**
     * Metodo de inicialização
     *
     * @param objClass <code><b>Class</b><T></code> Classe a ser mapeada
     * @param list <code><b>List</b><T></code> Lista de objetos
     */
    private void initialize(Class<T> objClass, List<T> list) {
        this.objClass = objClass;
        this.list = list != null ? list : new LinkedList<T>();
        this.columns = mapColumns(objClass);
    }

    /**
     * Retorna os nomes das colunas
     *
     * @return <code><b>String[]</b></code> Colunas do objeto
     */
    public String[] getColumnNames() {
        return this.columns;
    }

    /**
     * Busca as colunas na classe do objeto do modelo
     *
     * @param cl <code><b>Class</b></code> Classe a ser mapeada
     * @return <code><b>String[]</b></code> Colunas do objeto
     */
    private String[] mapColumns(Class<?> cl) {
        String[] coluna = new String[cl.getDeclaredFields().length];
        for (int i = 0; i < cl.getDeclaredFields().length; i++) {
            if (cl.getDeclaredFields()[i]
                    .isAnnotationPresent(ColumnName.class)) {
                coluna[i] = cl.getDeclaredFields()[i]
                        .getAnnotation(ColumnName.class).name();
            } else {
                coluna[i] = cl.getDeclaredFields()[i].getName();
            }
        }
        return coluna;
    }

    /**
     * Retorna se a coluna é editavel
     *
     * @param row <code><b>int</b></code> Index da linha
     * @param column <code><b>int</b></code> Index da coluna
     * @return <code><b>boolean</b></code> É editavel?
     */
    @Override
    public boolean isCellEditable(int row, int column) {
        return (column != 0);
    }

    /**
     * Retorna a quantidade de linhas
     *
     * @return <code><b>int</b></code> Quantidade de linhas
     */
    @Override
    public int getRowCount() {
        return list.size();
    }

    /**
     * Retorna a quantidade de colunas
     *
     * @return <code><b>int</b></code> Quantidade de colunas
     */
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    /**
     * Retorna o valor com base na linha e na coluna recebidas
     *
     * @param row <code><b>int</b></code> Index da linha
     * @param column <code><b>int</b></code> Index da coluna
     * @return <code><b>int</b></code>
     */
    @Override
    public T getValueAt(int row, int column) {
        try {
            Object u = list.get(row);
            Field f = u.getClass().getDeclaredFields()[column];
            f.setAccessible(true);
            return (T) f.get(u);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(GMPTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Retorna o nome da coluna
     *
     * @param column <code><b>int</b></code> Index da coluna
     * @return <code><b>String</b></code> Nome da coluna
     */
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    /**
     * Retorna a classe da coluna recebida
     *
     * @param column <code><b>int</b></code> Index da coluna
     * @return <code><b>Class</b><?></code> Classe da coluna
     */
    @Override
    public Class<?> getColumnClass(int column) {
        return getFieldClass(objClass, column);
    }

    /**
     * Retorna a classe do Field recebido
     *
     * @param cl <code><b>Class</b></code> Classe a ser mapeada
     * @param id <code><b>int</b></code> ID do Field
     * @return <code><b>Class</b><?></code> Classe do Field
     */
    private Class<?> getFieldClass(Class<?> cl, int id) {
        try {
            Field[] f = cl.getDeclaredFields();
            f[id].setAccessible(true);
            Class<?> c = cl.getDeclaredField(f[id].getName()).getType();
            if (c == boolean.class) {
                c = Boolean.TYPE;
            }
            return c;
        } catch (SecurityException | NoSuchFieldException ex) {
            Logger.getLogger(GMPTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return new Object().getClass();
        }
    }

    /**
     * Adiciona novo objeto à lista
     *
     * @param obj <code><b>T</b></code> Novo objeto
     */
    public void add(T obj) {
        list.add(obj);
        this.fireTableRowsInserted(list.size() - 1, list.size() - 1);
    }

    /**
     * Remove a linha recebida
     *
     * @param row <code><b>int</b></code> Linha
     */
    public void remove(int row) {
        list.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

    /**
     * Atualiza o objeto da linha recebida com o novo objeto
     *
     * @param row <code><b>int</b></code> Linha
     * @param obj <code><b>T</b></code> Novo conteudo da linha
     */
    public void update(int row, T obj) {
        list.set(row, obj);
        this.fireTableRowsUpdated(row, row);
    }

    /**
     * Retorna o objeto com base na linha recebida
     *
     * @param row <code><b>int</b></code> Linha
     * @return Objeto da linha
     */
    public T getObject(int row) {
        return list.get(row);
    }

    /**
     * Recarrega o modelo
     */
    public void reload() {
        this.fireTableDataChanged();
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        T object = list.get(row);
        Field field = object.getClass().getDeclaredFields()[col];
        try {
            field.setAccessible(true);
            field.set(object, value);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            String message = ex.getMessage();
            System.out.println(message);
        }
        fireTableCellUpdated(row, col);
    }

    /**
     * Retorna a classe do modelo
     *
     * @return <code>Class</code> Classe do modelo
     */
    public Class<T> getObjClass() {
        return objClass;
    }

    /**
     * s
     *
     * @param objClass
     */
    public void setObjClass(Class<T> objClass) {
        this.objClass = objClass;
    }

    /**
     * Retorna as colunas
     *
     * @return <code>String[]</code> Colunas
     */
    public String[] getColumns() {
        return columns;
    }

    /**
     * Altera as colunas
     *
     * @param columns <code>String[]</code> Colunas
     */
    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    /**
     * Retorna a lista do modelo
     *
     * @return <code>List<T></code> Lista do modelo
     */
    public List<T> getList() {
        return list;
    }

    /**
     * Modifica a lista do modelo
     *
     * @param list <code>List<T></code> Lista do modelo
     */
    public void setList(List<T> list) {
        this.list = list;
    }

}
