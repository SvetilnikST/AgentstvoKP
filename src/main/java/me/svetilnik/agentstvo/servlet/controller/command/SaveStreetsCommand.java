package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveStreetsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();

        String idStreets = req.getParameter("id");
        String streetsName = req.getParameter("streetsName");
        String mode = req.getParameter("mode");
        StreetsEntity streetsEntity = null;

        try {
            if (!idStreets.isEmpty() && mode.equalsIgnoreCase("edit")) {
                streetsEntity = streetsDao.getById(Long.parseLong(idStreets));
                streetsEntity.setStreetsName(streetsName);
                streetsDao.update(streetsEntity);
            } else {
                streetsEntity = new StreetsEntity();
                streetsEntity.setStreetsName(streetsName);
                streetsDao.insert(streetsEntity);
            }

        } catch (Exception e) {
            req.setAttribute("ERROR", "Предыдущее действие завершилось с ошибкой. Данные не были  добавлены");
        }
        return PageURL.LIST_STREETS_ACTION;
    }
}
