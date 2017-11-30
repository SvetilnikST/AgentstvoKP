package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.DealDaoImpl;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.DealEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long dealId = Long.parseLong(req.getParameter("id"));
        DealDaoImpl dao = new DealDaoImpl();
        DealEntity entity =dao.getById(dealId);
        dao.delete(entity);
        return PageURL.LIST_DEAL_ACTION;

    }
}
