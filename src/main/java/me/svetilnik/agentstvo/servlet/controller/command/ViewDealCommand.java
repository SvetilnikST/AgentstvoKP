package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ViewDealDaoImpl viewdealDao = new ViewDealDaoImpl();
        List<ViewdealEntity> viewdealEntities = viewdealDao.getAll(0, 0);
        req.setAttribute("viewdeal", viewdealEntities);
        req.setAttribute("title", "Список видов сделок");
        req.setAttribute("markviewdeal", "1");
        return PageURL.VIEWDEAL_PAGE;
    }
}
