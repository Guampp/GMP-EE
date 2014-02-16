package br.com.gmp.comps.table.interfaces;

/**
 * Interface de controle para tabelas paginadas
 *
 * @author kaciano
 */
public interface TableControl {

    /**
     * Próxima página
     */
    void nextPage();

    /**
     * Página anterior
     */
    void previousPage();

    /**
     * Retorna o numero máximo de linhas por página
     *
     * @return <code><b>int</b></code> Máximo de linhas por página
     */
    int getMaxRows();

    /**
     * Retorna página atual
     *
     * @return <code><b>int</b></code> Página atual
     */
    int getActualPage();

    /**
     * Indica a página para a qual a tabela deve ir
     *
     * @param page <code><b>int</b></code> Página indicada
     */
    void gotoPage(int page);
}
