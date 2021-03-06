package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.LocationDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LocationCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        LocationDaoImpl locationDao = new LocationDaoImpl();
        List<LocationEntity> locationEntities = locationDao.getAll(0, 0);
        req.setAttribute("location", locationEntities);
        req.setAttribute("title", "Список расположений");
        req.setAttribute("marklocation", "1");

        return PageURL.LOCATION_PAGE;
    }
}
