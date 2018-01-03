package me.svetilnik.agentstvo.servlet.controller;

import me.svetilnik.agentstvo.servlet.controller.command.*;

public enum CommandEnum {
    LOGIN {{
        this.command = new LoginCommand();
    }},

    LOGOUT {{
        this.command = new LogOutCommand();
    }},
    //Команды таблица виды сделок
    VIEWDEAL {{
        this.command = new ViewDealCommand();
    }},
    DELETE_VIEWDEAL {{
        this.command = new DeleteViewDealCommand();
    }},
    ADD_VIEWDEAL {{
        this.command = new AddViewDealCommand();
    }},
    EDIT_VIEWDEAL {{
        this.command = new EditViewDealCommand();
    }},
    SAVE_VIEWDEAL {{
        this.command = new SaveViewDealCommand();
    }},

    //Команды таблица улицы
    STREETS {{
        this.command = new StreetsCommand();
    }},
    ADD_STREETS {{
        this.command = new AddStreetsCommand();
    }},
    SAVE_STREETS {{
        this.command = new SaveStreetsCommand();
    }},
    EDIT_STREETS {{
        this.command = new EditStreetsCommand();
    }},
    DELETE_STREETS {{
        this.command = new DeleteStreetsCommand();
    }},

    //Команды таблица виды недвижимости
    PROPERTY {{
        this.command = new PropertyCommand();
    }},
    DELETE_PROPERTY {{
        this.command = new DeletePropertyCommand();
    }},
    ADD_PROPERTY {{
        this.command = new AddPropertyCommand();
    }},
    EDIT_PROPERTY {{
        this.command = new EditPropertyCommand();
    }},
    SAVE_PROPERTY {{
        this.command = new SavePropertyCommand();
    }},

    //Команды таблица должности
    POSITIONS {{
        this.command = new PositionsCommand();
    }},
    DELETE_POSITIONS {{
        this.command = new DeletePositionsCommand();
    }},
    ADD_POSITIONS {{
        this.command = new AddPositionsCommand();
    }},
    EDIT_POSITIONS {{
        this.command = new EditPositionsCommand();
    }},
    SAVE_POSITIONS {{
        this.command = new SavePositionsCommand();
    }},

    //Команды таблица клиентов
    CLIENTS {{
        this.command = new ClientsCommand();
    }},
    DELETE_CLIENTS {{
        this.command = new DeleteClientsCommand();
    }},
    ADD_CLIENTS {{
        this.command = new AddClientsCommand();
    }},
    EDIT_CLIENTS {{
        this.command = new EditClientsCommand();
    }},
    SAVE_CLIENTS {{
        this.command = new SaveClientsCommand();
    }},

    //Команды таблица расположений
    LOCATION {{
        this.command = new LocationCommand();
    }},
    DELETE_LOCATION {{
        this.command = new DeleteLocationCommand();
    }},
    ADD_LOCATION {{
        this.command = new AddLocationCommand();
    }},
    EDIT_LOCATION {{
        this.command = new EditLocationCommand();
    }},
    SAVE_LOCATION {{
        this.command = new SaveLocationCommand();
    }},

    //Команды таблица сотрудники
    EMPLOYEES {{
        this.command = new EmployeesCommand();
    }},
    DELETE_EMPLOYEES {{
        this.command = new DeleteEmployeesCommand();
    }},
    ADD_EMPLOYEES {{
        this.command = new AddEmployeesCommand();
    }},
    EDIT_EMPLOYEES {{
        this.command = new EditEmployeesCommand();
    }},
    SAVE_EMPLOYEES {{
        this.command = new SaveEmployeesCommand();
    }},

    //Команды таблица параметры недвижимости
    PARAMPROPERTY {{
        this.command = new ParamPropertyCommand();
    }},
    DELETE_PARAMPROPERTY {{
        this.command = new DeleteParamPropertyCommand();
    }},
    ADD_PARAMPROPERTY {{
        this.command = new AddParamPropertyCommand();
    }},
    EDIT_PARAMPROPERTY {{
        this.command = new EditParamPropertyCommand();
    }},
    SAVE_PARAMPROPERTY {{
        this.command = new SaveParamPropertyCommand();
    }},

    //Команды таблица сделки
    DEAL {{
        this.command = new DealCommand();
    }},
    DELETE_DEAL {{
        this.command = new DeleteDealCommand();
    }},
    ADD_DEAL {{
        this.command = new AddDealCommand();
    }},
    EDIT_DEAL {{
        this.command = new EditDealCommand();
    }},
    SAVE_DEAL {{
        this.command = new SaveDealCommand();
    }},
    REPORT_DEAL {{
        this.command = new ReportDealCommand();
    }},;

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }

}
