package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

    public class StreetsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        StreetsDaoImpl streetsDao = new StreetsDaoImpl();
        List<StreetsEntity> streetsEntities = streetsDao.getAll(0,0);

        req.setAttribute("streets", streetsEntities);
        req.setAttribute("title", "Список улиц");
        return PageURL.STREETS_PAGE;


    }
}
