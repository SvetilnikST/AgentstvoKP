package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PropertyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        List<PropertyEntity> propertyEntities = propertyDao.getAll(0, 0);
        req.setAttribute("property", propertyEntities);
        req.setAttribute("title", "Список недвижимости");
        req.setAttribute("markproperty", "1");
        return PageURL.PROPERTY_PAGE;
    }
}
