package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

    public class StreetsCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
/*
        if (req.getParameter("page") != null)
            page = Integer.parseInt(req.getParameter("page"));
        WorkTaskViewDaoImpl workTaskViewDao = WorkTaskViewDaoImpl.getInstance();
        List<WorkTaskView> items = workTaskViewDao.getAll((page - 1) * recordsPerPage, recordsPerPage);
        int numOfRecords = workTaskViewDao.getNumOfRecords("worktask");
        int noOfPages = (int) Math.ceil(numOfRecords * 1.0 / recordsPerPage);
        req.setAttribute("workTasks", items);
        req.setAttribute("noOfPages", noOfPages);
        req.setAttribute("currentPage", page);
        return PageURL.LIST_WORKTASK;
 */
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();
        List<StreetsEntity> streetsEntities = streetsDao.getAll(0,0);

        req.setAttribute("streets", streetsEntities);
        return PageURL.STREETS_PAGE;


    }
}