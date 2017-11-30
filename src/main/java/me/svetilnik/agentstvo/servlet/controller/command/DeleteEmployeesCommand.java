package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.ClientsDaoImpl;
import me.svetilnik.dbService.DAO.Impl.EmployeesDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteEmployeesCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long employeesId = Long.parseLong(req.getParameter("id"));
        EmployeesDaoImpl dao = new EmployeesDaoImpl();
        EmployeesEntity entity =dao.getById(employeesId);
        dao.delete(entity);
        return PageURL.LIST_EMPLOYEES_ACTION;

    }
}
