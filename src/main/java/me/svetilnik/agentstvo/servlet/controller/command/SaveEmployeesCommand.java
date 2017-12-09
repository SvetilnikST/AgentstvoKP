package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.EmployeesDaoImpl;
import me.svetilnik.dbService.DAO.Impl.LocationDaoImpl;
import me.svetilnik.dbService.DAO.Impl.PositionsDaoImpl;
import me.svetilnik.dbService.DAO.Impl.StreetsDaoImpl;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

public class SaveEmployeesCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
        PositionsDaoImpl positionsDao = new PositionsDaoImpl();

        String idEmployees = req.getParameter("idEmployees");
        String employeesSNM = req.getParameter("employeesSNM");
        String employeesFloor = req.getParameter("employeesFloor");
        String employeesCitizinship = req.getParameter("employeesCitiziship");
        String employeesDoB = req.getParameter("employeesDoB");
        String employeesPassport = req.getParameter("employeesPassport");
        String position = req.getParameter("position");
        String employeesPhone = req.getParameter("employeesPhone");
        String employeesMail = req.getParameter("employeesMail");
        String password = req.getParameter("password");
        String solt = req.getParameter("solt");
        String status = req.getParameter("status");
        String mode = req.getParameter("mode");

        EmployeesEntity employeesEntity = null;
        PositionsEntity selPosition = positionsDao.getById(Long.parseLong(position));

        if( !idEmployees.isEmpty() && mode.equalsIgnoreCase("edit")) {
            employeesEntity = employeesDao.getById(Long.parseLong(idEmployees));
            employeesEntity.setEmployeesSnm(employeesSNM);
            employeesEntity.setEmployeesFloor(employeesFloor);
            employeesEntity.setEmployeesCitizinship(employeesCitizinship);
            employeesEntity.setEmployeesDoB(Timestamp.valueOf(employeesDoB));
            employeesEntity.setEmployeesPassport(employeesPassport);
            employeesEntity.setPositionsEntity(selPosition);
            employeesEntity.setEmployeesPhone(employeesPhone);
            employeesEntity.setEmployeesMail(employeesMail);
            employeesEntity.setPassword(password);
            employeesEntity.setSolt(solt);
            employeesEntity.setStatus(Integer.parseInt(status));

            employeesDao.update(employeesEntity);
        }else {
            employeesEntity = new EmployeesEntity();
            employeesEntity.setEmployeesSnm(employeesSNM);
            employeesEntity.setEmployeesFloor(employeesFloor);
            employeesEntity.setEmployeesCitizinship(employeesCitizinship);
            employeesEntity.setEmployeesDoB(Timestamp.valueOf(employeesDoB));
            employeesEntity.setEmployeesPassport(employeesPassport);
            employeesEntity.setPositionsEntity(selPosition);
            employeesEntity.setEmployeesPhone(employeesPhone);
            employeesEntity.setEmployeesMail(employeesMail);
            employeesEntity.setPassword(password);
            employeesEntity.setSolt(solt);
            employeesEntity.setStatus(Integer.parseInt(status));

            employeesDao.insert(employeesEntity);
        }

        return PageURL.LIST_EMPLOYEES_ACTION;
    }
}
