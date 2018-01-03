package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PositionsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PositionsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PositionsDaoImpl positionsDao = new PositionsDaoImpl();
        List<PositionsEntity> positionsEntities = positionsDao.getAll(0, 0);
        req.setAttribute("positions", positionsEntities);
        req.setAttribute("title", "Список должностей");
        req.setAttribute("markpositions", "1");
        return PageURL.POSITIONS_PAGE;
    }
}
