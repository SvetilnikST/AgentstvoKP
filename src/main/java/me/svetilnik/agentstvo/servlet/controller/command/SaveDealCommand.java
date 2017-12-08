package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.*;
import me.svetilnik.dbService.hibernate.model.dataSet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;

public class SaveDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DealDaoImpl dealDao = new DealDaoImpl();

        ClientsDaoImpl clientsDao1 = new ClientsDaoImpl();
        ClientsDaoImpl clientsDao2 = new ClientsDaoImpl();
        ViewDealDaoImpl viewDealDao = new ViewDealDaoImpl();
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();



        String idDeal = req.getParameter("idDeal");
        String DateDeal = req.getParameter("dateDeal");
        String DealClient1 = req.getParameter("dealClient1");
        String DealClient2 = req.getParameter("dealClient2");
        String DealView = req.getParameter("dealView");
        String DealProperty = req.getParameter("dealProperty");
        String DealPropertyParam = req.getParameter("dealPropertyParam");
        String DealEmployees = req.getParameter("dealEmployees");
        String DealSum = req.getParameter("dealSum");
        String DealPercent = req.getParameter("dealPercent");

        String mode = req.getParameter("mode");

        DealEntity dealEntity = null;
//        PositionsEntity selPosition = positionsDao.getById(Long.parseLong(position));
        ClientsEntity selClients1 = clientsDao1.getById(Long.parseLong(DealClient1));
        ClientsEntity selClients2 = clientsDao2.getById(Long.parseLong(DealClient2));
        ViewdealEntity selViewDeal = viewDealDao.getById(Long.parseLong(DealView));
        PropertyEntity selProperty = propertyDao.getById(Long.parseLong(DealProperty));


        if( !idDeal.isEmpty() && mode.equalsIgnoreCase("edit")) {
            dealEntity = dealDao.getById(Long.parseLong(idDeal));
//            employeesEntity.setEmployeesSnm(employeesSNM);
//            employeesEntity.setEmployeesFloor(employeesFloor);
//            employeesEntity.setEmployeesCitizinship(employeesCitizinship);
//            employeesEntity.setEmployeesDoB(Timestamp.valueOf(employeesDoB));
//            employeesEntity.setEmployeesPassport(employeesPassport);
//            employeesEntity.setPositionsEntity(selPosition);
//            employeesEntity.setEmployeesPhone(employeesPhone);
//            employeesEntity.setEmployeesMail(employeesMail);
//            employeesEntity.setPassword(password);
//            employeesEntity.setSolt(solt);
//            employeesEntity.setStatus(Integer.parseInt(status));
//
            dealDao.update(dealEntity);
        }else {
            dealEntity = new DealEntity();
//            employeesEntity.setEmployeesSnm(employeesSNM);
//            employeesEntity.setEmployeesFloor(employeesFloor);
//            employeesEntity.setEmployeesCitizinship(employeesCitizinship);
//            employeesEntity.setEmployeesDoB(Timestamp.valueOf(employeesDoB));
//            employeesEntity.setEmployeesPassport(employeesPassport);
//            employeesEntity.setPositionsEntity(selPosition);
//            employeesEntity.setEmployeesPhone(employeesPhone);
//            employeesEntity.setEmployeesMail(employeesMail);
//            employeesEntity.setPassword(password);
//            employeesEntity.setSolt(solt);
//            employeesEntity.setStatus(Integer.parseInt(status));
//
            dealDao.insert(dealEntity);
        }

        return PageURL.LIST_DEAL_ACTION;
    }
}
