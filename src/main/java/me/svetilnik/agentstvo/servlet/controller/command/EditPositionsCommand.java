package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PositionsDaoImpl;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditPositionsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PositionsDaoImpl positionsDao = new PositionsDaoImpl();

        String idPositions = req.getParameter("id");
        PositionsEntity positionsEntity = null;

        if (!idPositions.isEmpty()) {
            positionsEntity = positionsDao.getById(Long.parseLong(idPositions));
        } else {
            positionsEntity = new PositionsEntity();
        }
        req.setAttribute("id", positionsEntity.getIdPositions());
        req.setAttribute("positions", positionsEntity.getPositions());
        req.setAttribute("mode", "edit");

        return PageURL.ADD_POSITIONS;
    }
}
