package comps.wizard.task.list;

import comps.wizard.task.WizardTask;
import java.awt.Component;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;

/**
 * Lista para tasks do Wizard
 *
 * @author kaciano
 * @version 1.0
 * @since 1.0
 */
public class WizardTaskList extends JList {

    private List<WizardTask> taskList;
    private WizardTaskListModel taskmodel;

    /**
     * Cria nova instancia de WizardList
     */
    public WizardTaskList() {
        taskList = new LinkedList<>();
        taskList.add(new WizardTask("Test", "Test description", false));
        initComponents();
        refresh();
    }

    /**
     * Cria nova instancia de WizardList
     *
     * @param taskList
     */
    public WizardTaskList(List<WizardTask> taskList) {
        this.taskList = taskList;
        initComponents();
        refresh();
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        DefaultListCellRenderer cellrenderer = new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list,
                    Object value, int index, boolean isSelected,
                    boolean cellHasFocus) {
                String task = "<html><b>"
                        + taskList.get(index).getTitle()
                        + "</b></html>";
                return listCheckBox(task, taskList.get(index).isCompleted());
            }
        };
        return cellrenderer;
    }

    /**
     * Gera novo JCheckBox customizado
     *
     * @param title Titulo
     * @param selected Selecionado?
     * @return JCheckBox
     */
    private JCheckBox listCheckBox(String title, boolean selected) {
        JCheckBox jcb = new JCheckBox(title, selected);
        jcb.setOpaque(false);
        return jcb;
    }

    /**
     * Recarrega os dados
     */
    private void refresh() {
        taskmodel = new WizardTaskListModel(taskList);
        this.setModel(new WizardTaskListModel(taskList));
    }

    /**
     * Atualiza os dados
     */
    public void update() {
        refresh();
    }

    /**
     * Retorna o modelo da lista
     *
     * @return
     */
    public WizardTaskListModel getTaskModel() {
        return this.taskmodel;
    }

    @Override
    public ListModel getModel() {
        return getTaskModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    public List<WizardTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<WizardTask> taskList) {
        this.taskList = taskList;
        refresh();
    }

    //</editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
