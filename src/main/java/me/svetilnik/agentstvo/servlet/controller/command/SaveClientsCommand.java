package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ClientsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveClientsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ClientsDaoImpl clientsDao = new ClientsDaoImpl();

        String idClients = req.getParameter("id");
        String snmClients = req.getParameter("snmClients");
        String floor = req.getParameter("floor");
        String passportClients = req.getParameter("passportClients");
        String phoneClients = req.getParameter("phoneClients");
        String mode = req.getParameter("mode");

        ClientsEntity clientsEntity = null;
        try {
            if (!idClients.isEmpty() && mode.equalsIgnoreCase("edit")) {
                clientsEntity = clientsDao.getById(Long.parseLong(idClients));
                clientsEntity.setSnmClients(snmClients);
                clientsEntity.setFloor(floor);
                clientsEntity.setPassportClients(passportClients);
                clientsEntity.setPhoneClients(phoneClients);
                clientsDao.update(clientsEntity);
            } else {
                clientsEntity = new ClientsEntity();
                clientsEntity.setSnmClients(snmClients);
                clientsEntity.setFloor(floor);
                clientsEntity.setPassportClients(passportClients);
                clientsEntity.setPhoneClients(phoneClients);
                clientsDao.insert(clientsEntity);
            }
        } catch (Exception e) {
            req.setAttribute("ERROR", "Предыдущее действие завершилось с ошибкой. Данные не были  добавлены");
        }

        return PageURL.LIST_CLIENTS_ACTION;
    }
}
