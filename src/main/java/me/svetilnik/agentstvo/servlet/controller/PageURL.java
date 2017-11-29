package me.svetilnik.agentstvo.servlet.controller;

public interface PageURL {

    String LOGIN_PAGE = "/login.jsp";
    String LOGIN_ACTION = "/WorkTaskController?action=login";
    String ERROR_PAGE = "/error.jsp";

    String STREETS_PAGE = "/list_streets.jsp";
    String LIST_STREETS_ACTION = "/WorkTaskController?action=streets";
    String INSERT_OR_EDIT_STREETS = "/streets.jsp";
    String DELETE_STREETS = "/WorkTaskController?action=delete_streets&id";


    String LOCATION_PAGE = "/list_location.jsp";
    String LIST_LOCATION_ACTION = "/WorkTaskController?action=location";
    String DELETE_LOCATION = "/WorkTaskController?action=delete_location&id";

    String DEAL_PAGE = "/list_deal.jsp";
    String LIST_DEAL_ACTION = "/WorkTaskController?action=deal";
    String DELETE_DEAL = "/WorkTaskController?action=delete_deal&id";

    String POSITIONS_PAGE = "/list_positions.jsp";
    String LIST_POSITIONS_ACTION = "/WorkTaskController?action=positions";
    String DELETE_POSITOINS = "/WorkTaskController?action=delete_positions&id";

    String VIEWDEAL_PAGE = "/list_viewdeal.jsp";
    String LIST_VIEWDEAL_ACTION = "/WorkTaskController?action=viewDeal";

    String DELETE_VIEWDEAL = "/WorkTaskController?action=delete_viewDeal&id";
    String ADD_VIEWDEAL = "/WorkTaskController?action=add_viewDeal";


    String CLIENTS_PAGE = "/list_clients.jsp";
    String LIST_CLIENTS_ACTION = "/WorkTaskController?action=clients";
    String DELETE_CLIENTS = "/WorkTaskController?action=delete_clients&id";

    String PROPERTY_PAGE = "/list_property.jsp";
    String LIST_PROPERTY_ACTION = "/WorkTaskController?action=property";
    String DELETE_PROPERTY = "/WorkTaskController?action=delete_property&id";


    String EMPLOYEES_PAGE = "/list_employees.jsp";
    String LIST_EMPLOYEES_ACTION = "/WorkTaskController?action=employees";
    String DELETE_EMPLOYEES = "/WorkTaskController?action=delete_employees&id";




    String PARAMPROPERTY_PAGE = "/list_paramProperty.jsp";
    String LIST_PARAMPROPERTY_ACTION = "/WorkTaskController?action=paramProperty";


}
