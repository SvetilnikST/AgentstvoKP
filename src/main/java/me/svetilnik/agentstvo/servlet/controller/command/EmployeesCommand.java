package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.EmployeesDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EmployeesCommand implements ActionCommand {
@Override
public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
    List<EmployeesEntity> employeesEntities = employeesDao.getAll(0,0);

    req.setAttribute("employees", employeesEntities);
    req.setAttribute("title", "Cписок сотрудников");
    req.setAttribute("markemployees","1");
    return PageURL.EMPLOYEES_PAGE;


}
}
