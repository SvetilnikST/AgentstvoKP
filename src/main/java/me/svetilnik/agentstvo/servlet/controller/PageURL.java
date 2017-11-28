package me.svetilnik.agentstvo.servlet.controller;

public interface PageURL {

    String LOGIN_PAGE = "/login.jsp";
    String LOGIN_ACTION = "/WorkTaskController?action=login";
    String ERROR_PAGE = "/error.jsp";

    String STREETS_PAGE = "/list_streets.jsp";
    String LIST_STREETS_ACTION = "/WorkTaskController?action=streets";
    String INSERT_OR_EDIT_STREETS = "/streets.jsp";

    String LOCATION_PAGE = "/list_location.jsp";
    String LIST_LOCATION_ACTION = "/WorkTaskController?action=location";

    String DEAL_PAGE = "/list_deal.jsp";
    String LIST_DEAL_ACTION = "/WorkTaskController?action=deal";

    String POSITIONS_PAGE = "/list_positions.jsp";
    String LIST_POSITIONS_ACTION = "/WorkTaskController?action=positions";

    String VIEWDEAL_PAGE = "/list_viewdeal.jsp";
    String LIST_VIEWDEAL_ACTION = "/WorkTaskController?action=viewDeal";

    String CLIENTS_PAGE = "/list_clients.jsp";
    String LIST_CLIENTS_ACTION = "/WorkTaskController?action=clients";

    String PROPERTY_PAGE = "/list_property.jsp";
    String LIST_PROPERTY_ACTION = "/WorkTaskController?action=property";

    String EMPLOYEES_PAGE = "/list_employees.jsp";
    String LIST_EMPLOYEES_ACTION = "/WorkTaskController?action=employees";




    String PARAMPROPERTY_PAGE = "/list_paramProperty.jsp";
    String LIST_PARAMPROPERTY_ACTION = "/WorkTaskController?action=paramProperty";


}
