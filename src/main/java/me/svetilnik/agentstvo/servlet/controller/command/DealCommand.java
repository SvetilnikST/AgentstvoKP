package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.DealDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.DealEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        DealDaoImpl dealDao = new DealDaoImpl();
        List<DealEntity> dealEntities = dealDao.getAll(0,0);

        req.setAttribute("deal", dealEntities);
        req.setAttribute("title", "список сделок");
        return PageURL.DEAL_PAGE;
    }
}
