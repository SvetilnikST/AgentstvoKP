package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PositionsDaoImpl;
import me.svetilnik.dbService.DAO.Impl.PropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletePositionsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long positionsId = Long.parseLong(req.getParameter("id"));
        PositionsDaoImpl dao = new PositionsDaoImpl();
        PositionsEntity entity = dao.getById(positionsId);
        dao.delete(entity);
        return PageURL.LIST_POSITIONS_ACTION;

    }
}
