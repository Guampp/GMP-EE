package br.com.gmp.comps.model;

import br.com.gmp.comps.annotations.ColumnName;
import java.lang.reflect.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.table.*;

/**
 *
 * @author kaciano
 */
public class GMPTableModel extends AbstractTableModel {
    //==========================================================================
    // Nome da coluna da table

    String[] columns = null;
    private final ArrayList list;
    private Object obj;

    //==========================================================================
    // Contrutor 1: Vazio
    public GMPTableModel() {
        this.list = new ArrayList();
        this.columns = colunas(new Object().getClass());
    }

    //==========================================================================
    // Contrutor 2: Lista
    public GMPTableModel(ArrayList list) {
        this.list = list;
        this.obj = this.list.get(0);
        this.columns = colunas(this.obj.getClass());
    }

    //==========================================================================
    // Contrutor 3: Objeto
    public GMPTableModel(Object obj) {
        this.list = new ArrayList();
        this.obj = obj;
        this.columns = colunas(obj.getClass());
    }

    //==========================================================================
    // Contrutor 1: Lista e objeto
    public GMPTableModel(ArrayList list, Object obj) {
        this.list = list;
        this.obj = obj;
        this.columns = colunas(obj.getClass());
    }

    public String[] getColumnNames() {
        return this.columns;
    }

    //==========================================================================
    // Retorna array de informações da cl do objeto    
    private String[] colunas(Class<?> cl) {
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

    //==========================================================================
    //
    @Override
    public boolean isCellEditable(int row, int column) {
        return (column != 0);
    }

    //==========================================================================
    // Numero de linhas
    @Override
    public int getRowCount() {
        return list.size();
    }

    //==========================================================================
    // Numero de colunas
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    //==========================================================================
    // Define o que cada coluna conterá do objeto
    @Override
    public Object getValueAt(int row, int column) {
        try {
            Object u = list.get(row);
            Field f = u.getClass().getDeclaredFields()[column];
            f.setAccessible(true);
            return f.get(u);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());
            return new Object();
        }
    }

    //==========================================================================
    // Determina o nome das colunas
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    //==========================================================================
    // Determina que tipo de objeto cada coluna irá suportar
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getFieldClass(obj.getClass(), columnIndex);
    }

    //==========================================================================
    // Retorna array de informações da cl do objeto    
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

    //==========================================================================
    //
    public void add(Object obj) {
        list.add(obj);
        this.fireTableRowsInserted(list.size() - 1, list.size() - 1);
    }

    //==========================================================================
    //
    public void remove(int row) {
        list.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

    //==========================================================================
    //
    public void update(int row, Object obj) {
        list.set(row, obj);
        this.fireTableRowsUpdated(row, row);
    }

    //==========================================================================
    //
    public Object getObject(int row) {
        return list.get(row);
    }

    //==========================================================================
    //
    public void reload() {
        this.fireTableDataChanged();
    }

    //==========================================================================
    // 
    @Override
    public void setValueAt(Object value, int row, int col) {
        Object object = list.get(row);
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
}
