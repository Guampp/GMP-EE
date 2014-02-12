package comps.wizard.event;

/**
 * 
 * @author kaciano
 */
public interface IWizardEvent {

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
}
