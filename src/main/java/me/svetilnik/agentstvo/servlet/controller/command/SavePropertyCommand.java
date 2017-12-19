package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SavePropertyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();

        String idProperty = req.getParameter("id");
        String property = req.getParameter("property");
        String mode = req.getParameter("mode");
        PropertyEntity propertyEntity = null;
        if( !idProperty.isEmpty() && mode.equalsIgnoreCase("edit")) {
            propertyEntity = propertyDao.getById(Long.parseLong(idProperty));
            propertyEntity.setProperty(property);
        }else {
            propertyEntity = new PropertyEntity();
            propertyEntity.setProperty(property);
        }
        propertyDao.insert(propertyEntity);

        return PageURL.LIST_PROPERTY_ACTION;
    }
}
