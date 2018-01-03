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
import java.util.List;

public class EditParamPropertyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();
        LocationDaoImpl locationDao = new LocationDaoImpl();

        List<LocationEntity> locationEntities = locationDao.getAll(0, 0);

        String idParamProperty = req.getParameter("id");
        ParampropertyEntity paramPropertyEntity = null;

        if (!idParamProperty.isEmpty()) {
            paramPropertyEntity = paramPropertyDao.getById(Long.parseLong(idParamProperty));
        } else {
            paramPropertyEntity = new ParampropertyEntity();
        }

        req.setAttribute("id", paramPropertyEntity.getIdParamProperty());
        req.setAttribute("paramPropertyEntity", paramPropertyEntity);
        req.setAttribute("locationEntities", locationEntities);
        req.setAttribute("curLocation", paramPropertyEntity.getLocationEntity().getIdLocation());
        req.setAttribute("mode", "edit");

        return PageURL.ADD_PARAMPOPERTY;
    }
}
