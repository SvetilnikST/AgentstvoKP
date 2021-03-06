package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ViewDealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveViewDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ViewDealDaoImpl viewdealDao = new ViewDealDaoImpl();

        String idViewDeal = req.getParameter("id");
        String viewDeal = req.getParameter("viewdeal");
        String mode = req.getParameter("mode");
        ViewdealEntity viewdealEntity = null;
        try {
            if (!idViewDeal.isEmpty() && mode.equalsIgnoreCase("edit")) {
                viewdealEntity = viewdealDao.getById(Long.parseLong(idViewDeal));
                viewdealEntity.setViewDeal(viewDeal);
                viewdealDao.update(viewdealEntity);
            } else {
                viewdealEntity = new ViewdealEntity();
                viewdealEntity.setViewDeal(viewDeal);
                viewdealDao.insert(viewdealEntity);
            }
        } catch (Exception e) {
            req.setAttribute("ERROR", "Предыдущее действие завершилось с ошибкой. Данные не были  добавлены");
        }

        return PageURL.LIST_VIEWDEAL_ACTION;
    }
}
