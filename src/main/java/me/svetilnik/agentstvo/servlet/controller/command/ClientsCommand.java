package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ClientsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ClientsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        ClientsDaoImpl clientsDao = new ClientsDaoImpl();
        List<ClientsEntity> clientsEntities = clientsDao.getAll(0,0);

        req.setAttribute("clients", clientsEntities);
        return PageURL.CLIENTS_PAGE;
    }
}
