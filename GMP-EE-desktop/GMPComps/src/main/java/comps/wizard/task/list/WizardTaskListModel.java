package comps.wizard.task.list;

import comps.wizard.task.WizardTask;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 * Modelo da WizardTaskList
 *
 * @author kaciano
 */
public class WizardTaskListModel extends AbstractListModel<WizardTask> {

    private List<WizardTask> taskList;

    /**
     * Cria novo Modelo da WizardTaskList
     *
     * @param taskList Lista de WizardTasks
     */
    public WizardTaskListModel(List<WizardTask> taskList) {
        this.taskList = taskList;
    }

    /**
     * Adiciona um novo WizardTask
     *
     * @param task WizardTask
     */
    public void add(WizardTask task) {
        taskList.add(task);
    }

    /**
     * Remove o WizardTask
     *
     * @param task WizardTask
     * @return A lista contem a WizardTask?
     */
    public boolean remove(WizardTask task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSize() {
        return taskList.size();
    }

    @Override
    public WizardTask getElementAt(int index) {
        return taskList.get(index);
    }

    /**
     * Retorna a WizardTask no endereço recebido
     *
     * @param index Endereço da WizardTask
     * @return WizardTask
     */
    public WizardTask getTaskAt(int index) {
        return taskList.get(index);
    }

    /**
     *
     * @return
     */
    public List<WizardTask> getTaskList() {
        return taskList;
    }

    /**
     *
     * @param taskList
     */
    public void setTaskList(List<WizardTask> taskList) {
        this.taskList = taskList;
    }

}
