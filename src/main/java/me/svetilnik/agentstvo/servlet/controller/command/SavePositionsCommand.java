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

public class SavePositionsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PositionsDaoImpl positionsDao = new PositionsDaoImpl();

        String idPositions = req.getParameter("id");
        String positions = req.getParameter("positions");
        String mode = req.getParameter("mode");
        PositionsEntity positionsEntity = null;

        try {
            if (!idPositions.isEmpty() && mode.equalsIgnoreCase("edit")) {
                positionsEntity = positionsDao.getById(Long.parseLong(idPositions));
                positionsEntity.setPositions(positions);
                positionsDao.update(positionsEntity);
            } else {
                positionsEntity = new PositionsEntity();
                positionsEntity.setPositions(positions);
                positionsDao.insert(positionsEntity);
            }
        } catch (Exception e) {
            req.setAttribute("ERROR", "Предыдущее действие завершилось с ошибкой. Данные не были  добавлены");
            return PageURL.LIST_POSITIONS_ACTION;
        }
        return PageURL.LIST_POSITIONS_ACTION;
    }
}
