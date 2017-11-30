package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStreetsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();

        String idStreets = req.getParameter("idStreets");
        String streets = req.getParameter("streetsName");
        StreetsEntity streetsEntity = null;

        if(!idStreets.isEmpty()){
            streetsEntity = streetsDao.getById(Long.parseLong(idStreets));
        }else {
            streetsEntity = new StreetsEntity();
        }
        streetsEntity.setStreetsName(streets);
        streetsDao.insert(streetsEntity);

        return PageURL.LIST_STREETS_ACTION;
    }
}
