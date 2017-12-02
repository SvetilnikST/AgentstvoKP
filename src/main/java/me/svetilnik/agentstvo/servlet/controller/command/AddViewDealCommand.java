package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddViewDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ViewDealDaoImpl viewdealDao = new ViewDealDaoImpl();
        req.setAttribute("id", "");
        req.setAttribute("viewdeal", "");
        req.setAttribute("mode", "create");
        return PageURL.ADD_VIEWDEAL;
    }
}
