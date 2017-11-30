package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteViewDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long viewdealId = Long.parseLong(req.getParameter("id"));
        ViewDealDaoImpl dao = new ViewDealDaoImpl();
        ViewdealEntity entity =dao.getById(viewdealId);
        dao.delete(entity);
        return PageURL.LIST_VIEWDEAL_ACTION;

    }
}
