package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditViewDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ViewDealDaoImpl viewdealDao = new ViewDealDaoImpl();

        String idViewDeal = req.getParameter("id");
        ViewdealEntity viewdealEntity=null;
        if( !idViewDeal.isEmpty()) {
            viewdealEntity = viewdealDao.getById(Long.parseLong(idViewDeal));
        }else {
            viewdealEntity = new ViewdealEntity();
        }

        req.setAttribute("id", viewdealEntity.getIdViewDeal());
        req.setAttribute("viewdeal", viewdealEntity.getViewDeal());
        req.setAttribute("mode", "edit");
        return PageURL.ADD_VIEWDEAL;
    }
}
