package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.EmployeesDaoImpl;
import me.svetilnik.dbService.DAO.Impl.PositionsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class AddEmployeesCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
        PositionsDaoImpl positionsDao = new PositionsDaoImpl();
        List<PositionsEntity> positionsEntities = positionsDao.getAll(0,0);
        EmployeesEntity employeesEntity = null;

        req.setAttribute("id", "");
        req.setAttribute("employeesEntity", employeesEntity);
        req.setAttribute("positionsEntities", positionsEntities);
        req.setAttribute("curPosition", "-1");

        req.setAttribute("mode", "create"); //добавлено
        return PageURL.ADD_EMPLOYEES;
    }
}
