package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ClientsDaoImpl;
import me.svetilnik.dbService.DAO.Impl.PositionsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditClientsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ClientsDaoImpl clientsDao = new ClientsDaoImpl();

        String idClients = req.getParameter("id");
        ClientsEntity clientsEntity = null;

        if (!idClients.isEmpty()) {
            clientsEntity = clientsDao.getById(Long.parseLong(idClients));
        } else {
            clientsEntity = new ClientsEntity();
        }
        req.setAttribute("id", clientsEntity.getIdClients());
        req.setAttribute("snmClients", clientsEntity.getSnmClients());
        req.setAttribute("floor", clientsEntity.getFloor());
        req.setAttribute("passportClients", clientsEntity.getPassportClients());
        req.setAttribute("phoneClients", clientsEntity.getPhoneClients());

        req.setAttribute("mode", "edit");

        return PageURL.ADD_CLIENTS;
    }
}
