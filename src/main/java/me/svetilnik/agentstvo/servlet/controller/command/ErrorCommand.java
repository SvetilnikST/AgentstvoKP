package me.svetilnik.agentstvo.servlet.controller.command;
import me.svetilnik.agentstvo.servlet.controller.PageURL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorCommand implements  me.svetilnik.agentstvo.servlet.controller.ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        return PageURL.ERROR_PAGE;
    }
}
