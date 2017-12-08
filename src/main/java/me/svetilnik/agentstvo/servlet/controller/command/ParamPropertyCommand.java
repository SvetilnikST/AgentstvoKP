package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ParamPropertyDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ParampropertyEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ParamPropertyCommand implements ActionCommand {
@Override
public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();
    List<ParampropertyEntity> parampropertyEntities = paramPropertyDao.getAll(0,0);

    req.setAttribute("paramproperty", parampropertyEntities);
    req.setAttribute("title", "Cписок параметров недвижимости ");
    return PageURL.PARAMPOPERTY_PAGE;
}
}
