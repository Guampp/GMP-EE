package comps.wizard.event;

import comps.wizard.task.WizardTask;
import java.util.List;

/**
 *
 * @author kaciano
 */
public interface WizardEvent {

    /**
     * Voltar para a task anterior
     */
    void previous();

    /**
     * Ir para próxima task
     */
    void next();

    /**
     * Cancelar o Wizard
     */
    void cancel();

    /**
     * Mostrar informações
     */
    void info();

    /**
     * Retorna a lista das tarefas
     *
     * @return Lista das tarefas
     */
    List<WizardTask> getTaskList();
}
