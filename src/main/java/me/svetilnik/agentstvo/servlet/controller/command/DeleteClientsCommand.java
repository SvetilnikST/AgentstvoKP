package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ClientsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteClientsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long clientsId = Long.parseLong(req.getParameter("id"));
        ClientsDaoImpl dao = new ClientsDaoImpl();
        ClientsEntity entity =dao.getById(clientsId);
        dao.delete(entity);
        return PageURL.LIST_CLIENTS_ACTION;

    }
}
