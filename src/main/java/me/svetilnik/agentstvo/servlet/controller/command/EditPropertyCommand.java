package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditPropertyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();

        String idProperty = req.getParameter("id");
        PropertyEntity propertyEntity = null;

        if (!idProperty.isEmpty()) {
            propertyEntity = propertyDao.getById(Long.parseLong(idProperty));
        } else {
            propertyEntity = new PropertyEntity();
        }
        req.setAttribute("id", propertyEntity.getIdProperty());
        req.setAttribute("property", propertyEntity.getProperty());
        req.setAttribute("mode", "edit");
        return PageURL.ADD_PROPERTY;
    }
}
