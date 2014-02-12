package comps.wizard.task;

import java.util.Objects;
import javax.swing.JPanel;

/**
 * Objeto padrão para a lista de tarefas dos Wizards
 *
 * @author kaciano
 * @since 1.0
 */
public class WizardTask {

    private String title;
    private String description;
    private Boolean completed = false;
    private JPanel taskpanel;

    /**
     * Cria nova instancia da tarefa
     */
    public WizardTask() {
    }

    /**
     * Cria nova instancia da tarefa
     *
     * @param title Titulo da tarefa
     * @param description Descrição da tarefa
     * @param completed Status de conclusão
     */
    public WizardTask(String title, String description, Boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    /**
     * Cria nova instancia da tarefa
     *
     * @param title Titulo da tarefa
     * @param description Descrição da tarefa
     * @param completed Status de conclusão
     * @param taskpanel Painel da task
     */
    public WizardTask(String title, String description, Boolean completed, JPanel taskpanel) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.taskpanel = taskpanel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.completed);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WizardTask other = (WizardTask) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.completed, other.completed);
    }

    @Override
    public String toString() {
        return "WizardTask{"
                + "title=" + title
                + ", description=" + description
                + ", completed=" + completed + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public JPanel getTaskpanel() {
        return taskpanel;
    }

    public void setTaskpanel(JPanel taskpanel) {
        this.taskpanel = taskpanel;
    }

}
