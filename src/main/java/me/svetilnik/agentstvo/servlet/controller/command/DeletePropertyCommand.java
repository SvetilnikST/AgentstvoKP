package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletePropertyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long propertyId = Long.parseLong(req.getParameter("id"));
        PropertyDaoImpl dao = new PropertyDaoImpl();
        PropertyEntity entity =dao.getById(propertyId);
        dao.delete(entity);
        return PageURL.LIST_PROPERTY_ACTION;

    }
}
