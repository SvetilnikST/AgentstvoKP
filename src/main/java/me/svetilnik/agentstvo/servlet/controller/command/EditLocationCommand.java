package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.LocationDaoImpl;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EditLocationCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LocationDaoImpl locationDao = new LocationDaoImpl();
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();

        List<StreetsEntity> streetsEntities = streetsDao.getAll(0,0);

        String idLocation = req.getParameter("id");
        LocationEntity locationEntity = null;

        if( !idLocation.isEmpty()) {
            locationEntity = locationDao.getById(Long.parseLong(idLocation));
        }else {
            locationEntity = new LocationEntity();
        }
        req.setAttribute("id", locationEntity.getIdLocation());
        req.setAttribute("locationEntity", locationEntity);
        req.setAttribute("streetsEntities", streetsEntities);
        req.setAttribute("curStreet", locationEntity.getStreetsEntity().getIdStreets());

        req.setAttribute("mode", "edit");

        return PageURL.ADD_LOCATION;
    }
}
