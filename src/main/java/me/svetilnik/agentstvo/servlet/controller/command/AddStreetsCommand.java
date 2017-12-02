package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStreetsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();
        req.setAttribute("id", "");
        req.setAttribute("streetsName", "");
        req.setAttribute("mode", "create");
        return PageURL.ADD_STREETS;
    }
}
