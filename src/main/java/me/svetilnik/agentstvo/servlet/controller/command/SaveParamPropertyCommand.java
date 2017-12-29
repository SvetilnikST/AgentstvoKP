package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.LocationDaoImpl;
import me.svetilnik.dbService.DAO.Impl.ParamPropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.ParampropertyEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveParamPropertyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();
        LocationDaoImpl locationDao = new LocationDaoImpl();

        String idParamProperty = req.getParameter("idParamProperty");
        String paramPropertyArea = req.getParameter("paramPropertyArea");
        String paramPropertyFloor = req.getParameter("paramPropertyFloor");
        String paramPropertyDescription = req.getParameter("paramPropertyDescription");
        String paramPropertyLocation = req.getParameter("paramPropertyLocation");
        String mode = req.getParameter("mode");

        ParampropertyEntity parampropertyEntity = null;
        try {
            LocationEntity selLocation = locationDao.getById(Long.parseLong(paramPropertyLocation));
            if (!idParamProperty.isEmpty() && mode.equalsIgnoreCase("edit")) {
                parampropertyEntity = paramPropertyDao.getById(Long.parseLong(idParamProperty));
                parampropertyEntity.setParamPropertyArea(Integer.parseInt(paramPropertyArea));
                parampropertyEntity.setLocationEntity(selLocation);
                parampropertyEntity.setParamPropertyFloor(Integer.parseInt(paramPropertyFloor));
                parampropertyEntity.setParamPropertyDescription(paramPropertyDescription);
                paramPropertyDao.update(parampropertyEntity);
            } else {
                parampropertyEntity = new ParampropertyEntity();
                parampropertyEntity.setParamPropertyArea(Integer.parseInt(paramPropertyArea));
                parampropertyEntity.setLocationEntity(selLocation);
                parampropertyEntity.setParamPropertyFloor(Integer.parseInt(paramPropertyFloor));
                parampropertyEntity.setParamPropertyDescription(paramPropertyDescription);
                paramPropertyDao.insert(parampropertyEntity);
            }
        } catch (Exception e) {
            req.setAttribute("ERROR", "Предыдущее действие завершилось с ошибкой. Данные не были  добавлены");
        }
        return PageURL.LIST_PARAMPOPERTY_ACTION;
    }
}
