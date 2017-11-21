package me.svetilnik.agentstvo.servlet.controller;

public interface PageURL {
    String LOGIN_PAGE = "/login.jsp";
    String LOGIN_ACTION = "/WorkTaskController?action=login";
    String ERROR_PAGE = "/error.jsp";

    String STREETS_PAGE = "/list_streets.jsp";
    String POSITIONS_PAGE = "/list_positions.jsp";
    String VIEWDEAL_PAGE = "/list_viewdeal.jsp";
    String CLIENTS_PAGE = "/list_clients.jsp";
    String LOCATION_PAGE = "/list_location.jsp";
    String PROPERTY_PAGE = "/list_property.jsp";
    String PARAMPROPERTY_PAGE = "/list_paramproperty.jsp";
    String EMPLOYEES_PAGE = "/list_employees.jsp";


    String DOWNLOAD = "/download?downloadfile=";

    String LIST_WORKTASK_ACTION = "/WorkTaskController?action=list_worktasks";
    String LIST_WORKTASK = "/listWorkTask.jsp";
    String EDIT_WORKTASK_ACTION = "/WorkTaskController?action=edit_worktask&id=";
    String INSERT_OR_EDIT_WORKTASK = "/workTask.jsp";
    String INSERT_OR_EDIT_ATTACH = "/attach.jsp";

    String SELECT_USER = "/selectUser.jsp";
    String EDIT_USER = "/user.jsp";
    String LIST_USER_ACTION = "/WorkTaskController?action=list_users";
    String LIST_USER = "/listUser.jsp";
}
