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
    VIEWDEAL {{
        this.command = new ViewDealCommand();
    }},
    CLIENTS {{
        this.command = new ClientsCommand();
    }},
    DEAL {{
        this.command = new DealCommand();
    }},

    LOCATION {{
        this.command = new LocationCommand();
    }},
    PROPERTY {{
        this.command = new PropertyCommand();
    }},
    PARAMPROPERTY {{
        this.command = new ParamPropertyCommand();
    }},
    EMPLOYEES {{
        this.command = new EmployeesCommand();
    }},
    ;

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }

}
