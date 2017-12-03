package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.PositionsDaoImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddPositionsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PositionsDaoImpl positionsDao = new PositionsDaoImpl();
        req.setAttribute("id", "");
        req.setAttribute("positions", "");
        req.setAttribute("mode", "create");
        return PageURL.ADD_POSITIONS;
    }
}
