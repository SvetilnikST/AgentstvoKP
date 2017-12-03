package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditStreetsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();

        String idStreets = req.getParameter("id");
        StreetsEntity streetsEntity = null;

        if( !idStreets.isEmpty()) {
            streetsEntity = streetsDao.getById(Long.parseLong(idStreets));
        }else {
            streetsEntity = new StreetsEntity();
        }

        req.setAttribute("id", streetsEntity.getIdStreets());
        req.setAttribute("streets", streetsEntity.getStreetsName());
        req.setAttribute("mode", "edit");

        return PageURL.ADD_STREETS;
    }
}
