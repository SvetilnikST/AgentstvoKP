package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ParamPropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ParampropertyEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteParamPropertyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long paramPropertyId = Long.parseLong(req.getParameter("id"));
        ParamPropertyDaoImpl dao = new ParamPropertyDaoImpl();
        ParampropertyEntity entity = dao.getById(paramPropertyId);
        dao.delete(entity);
        return PageURL.LIST_PARAMPOPERTY_ACTION;

    }
}
