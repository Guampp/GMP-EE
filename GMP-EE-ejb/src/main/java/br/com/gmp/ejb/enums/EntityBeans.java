package br.com.gmp.ejb.enums;

/**
 * Classe que armazena os nomes dados aos beans de sessão de entidades
 *
 * @author kaciano
 * @since 1.0
 */
public interface EntityBeans {

    // Entidades
    public static final String ADDRESS_BEAN = "EJB/AddressFacade";
    public static final String COMPANY_BEAN = "EJB/CompanyFacade";
    public static final String COMPANY_INFO_BEAN = "EJB/CompanyInfoFacade";
    public static final String COMPANY_TYPE_BEAN = "EJB/CompanyTypeFacade";
    public static final String DEMAND_BEAN = "EJB/DemandFacade";
    public static final String DEMAND_INFO_BEAN = "EJB/DemandInfoFacade";
    public static final String DEMAND_PRIORITY_BEAN = "EJB/DemandPriorityFacade";
    public static final String DEMAND_SITUATION_BEAN = "EJB/DemandSituationFacade";
    public static final String DEMAND_TYPE_BEAN = "EJB/DemandTypeFacade";
    public static final String MENU_BEAN = "EJB/MenuFacade";
    public static final String MENU_ITEM_BEAN = "EJB/MenuItemFacade";
    public static final String PROFILEs_BEAN = "EJB/ProfileFacade";
    public static final String USER_BASE_BEAN = "EJB/UserBaseFacade";
    public static final String USER_INFO_BEAN = "EJB/UserInfoFacade";
    public static final String USER_TYPE_BEAN = "EJB/UserTypeFacade";
    // Controles
    public static final String MENU_CONTROLER = "EJB/MenuControler";
}
