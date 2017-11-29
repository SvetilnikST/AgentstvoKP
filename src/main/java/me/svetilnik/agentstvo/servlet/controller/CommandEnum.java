package me.svetilnik.agentstvo.servlet.controller;

import me.svetilnik.agentstvo.servlet.controller.command.*;

public enum  CommandEnum {
    LOGIN {{
        this.command = new LoginCommand();
    }},
    STREETS {{
        this.command = new StreetsCommand();
    }},
    POSITIONS {{
        this.command = new PositionsCommand();
    }},
    DELETE_POSITIONS {{
        this.command = new DeletePositionsCommand();
    }},
    VIEWDEAL {{
        this.command = new ViewDealCommand();
    }},

    DELETE_VIEWDEAL {{
        this.command = new DeleteViewDealCommand();
    }},

    ADD_VIEWDEAL {{
        this.command = new AddViewDealCommand();
    }},
    CLIENTS {{
        this.command = new ClientsCommand();
    }},
    DELETE_CLIENTS {{
        this.command = new DeleteClientsCommand();
    }},
    DEAL {{
        this.command = new DealCommand();
    }},
    DELETE_DEAL {{
        this.command = new DeleteDealCommand();
    }},

    LOCATION {{
        this.command = new LocationCommand();
    }},
    DELETE_LOCATION {{
        this.command = new DeleteLocationCommand();
    }},
    PROPERTY {{
        this.command = new PropertyCommand();
    }},

    DELETE_PROPERTY {{
        this.command = new DeletePropertyCommand();
    }},

    PARAMPROPERTY {{
        this.command = new ParamPropertyCommand();
    }},
    EMPLOYEES {{
        this.command = new EmployeesCommand();
    }},
    DELETE_EMPLOYEES {{
        this.command = new DeleteEmployeesCommand();
    }},
    ;

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }

}
