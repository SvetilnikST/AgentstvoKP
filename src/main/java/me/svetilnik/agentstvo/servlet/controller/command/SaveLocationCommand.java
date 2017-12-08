package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ClientsDaoImpl;
import me.svetilnik.dbService.DAO.Impl.LocationDaoImpl;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveLocationCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LocationDaoImpl locationDao = new LocationDaoImpl();
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();

        String idLocation = req.getParameter("idLocation");
        String locationStreet = req.getParameter("locationStreet");
        String locationHouse = req.getParameter("locationHouse");
        String locationCorps = req.getParameter("locationCorps");
        String locationFlat = req.getParameter("locationFlat");
        String mode = req.getParameter("mode");

        LocationEntity locationEntity = null;
        StreetsEntity selStreet = streetsDao.getById(Long.parseLong(locationStreet));
        if( !idLocation.isEmpty() && mode.equalsIgnoreCase("edit")) {
            locationEntity = locationDao.getById(Long.parseLong(idLocation));
            locationEntity.setStreetsEntity(selStreet);
            locationEntity.setLocationHouse(locationHouse);
            locationEntity.setLocationCorps(locationCorps);
            locationEntity.setLocationFlat(locationFlat);
            locationDao.update(locationEntity);
        }else {
            locationEntity = new LocationEntity();
            locationEntity.setStreetsEntity(selStreet);
            locationEntity.setLocationHouse(locationHouse);
            locationEntity.setLocationCorps(locationCorps);
            locationEntity.setLocationFlat(locationFlat);
            locationDao.insert(locationEntity);
        }

        return PageURL.LIST_LOCATION_ACTION;
    }
}
