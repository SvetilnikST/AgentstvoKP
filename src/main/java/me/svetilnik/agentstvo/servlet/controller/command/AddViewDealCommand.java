package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AddViewDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ViewDealDaoImpl viewdealDao = new ViewDealDaoImpl();
//        List<ViewdealEntity> viewdealEntities = viewdealDao.getAll(0,0);


        String idViewDeal = req.getParameter("idViewDeal");
        String viewDeal = req.getParameter("viewdeal");
        ViewdealEntity viewdealEntity=null;

        if( !idViewDeal.isEmpty()) {
            viewdealEntity = viewdealDao.getById(Long.parseLong(idViewDeal));
        }else {
            viewdealEntity = new ViewdealEntity();
        }

        viewdealEntity.setViewDeal(viewDeal);
//        viewdealEntity.setIdViewDeal(5);
        viewdealDao.insert(viewdealEntity);

//        req.setAttribute("viewdeal", viewdealEntities);
//        req.setAttribute("title", "Список видов сделок");
        return PageURL.LIST_VIEWDEAL_ACTION;
    }
}
