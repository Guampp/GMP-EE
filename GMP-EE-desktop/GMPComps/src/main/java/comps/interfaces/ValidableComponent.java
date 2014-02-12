package comps.interfaces;

/**
 * Interface de componentes validaveis
 *
 * @author kaciano
 */
public interface ValidableComponent {

    /**
     * Valida o componente
     *
     * @return <code>boolean</code> Resultado da validação
     */
    boolean validateComponent();

    /**
     * Ação executada quando o componente foi validado com sucesso
     */
    void validAction();

    /**
     * Ação executada quando o componente não foi validado
     */
    void invalidAction();
}
