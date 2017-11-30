package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PropertyDaoImpl;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteStreetsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long streetsId = Long.parseLong(req.getParameter("id"));
        StreetsDaoImpl dao = new StreetsDaoImpl();
        StreetsEntity entity =dao.getById(streetsId);
        dao.delete(entity);
        return PageURL.LIST_STREETS_ACTION;

    }
}
