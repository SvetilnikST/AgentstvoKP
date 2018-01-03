package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.*;
import me.svetilnik.dbService.hibernate.model.dataSet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SaveDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DealDaoImpl dealDao = new DealDaoImpl();

        ClientsDaoImpl clientsDao = new ClientsDaoImpl();
        ViewDealDaoImpl viewDealDao = new ViewDealDaoImpl();
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();
        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();


        String idDeal = req.getParameter("idDeal");
        String dateDeal = req.getParameter("dateDeal");
        String dealClient1 = req.getParameter("dealClient1");
        String dealClient2 = req.getParameter("dealClient2");
        String dealView = req.getParameter("dealView");
        String dealProperty = req.getParameter("dealProperty");
        String dealPropertyParam = req.getParameter("dealPropertyParam");
        String dealEmployee = req.getParameter("dealEmployee");
        String dealSum = req.getParameter("dealSum");
        String dealPercent = req.getParameter("dealPercent");

        String mode = req.getParameter("mode");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DealEntity dealEntity = null;

        ClientsEntity selClients1 = clientsDao.getById(Long.parseLong(dealClient1));
        ClientsEntity selClients2 = clientsDao.getById(Long.parseLong(dealClient2));
        ViewdealEntity selViewDeal = viewDealDao.getById(Long.parseLong(dealView));
        PropertyEntity selProperty = propertyDao.getById(Long.parseLong(dealProperty));
        ParampropertyEntity selPropertyParam = paramPropertyDao.getById(Long.parseLong(dealPropertyParam));
        EmployeesEntity selEmployee = employeesDao.getById(Long.parseLong(dealEmployee));
        try {
            if (!idDeal.isEmpty() && mode.equalsIgnoreCase("edit")) {
                dealEntity = dealDao.getById(Long.parseLong(idDeal));
                try {
                    dealEntity.setDateDeal(new Date(simpleDateFormat.parse(dateDeal).getTime()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                dealEntity.setClientsEntity1(selClients1);
                dealEntity.setClientsEntity2(selClients2);
                dealEntity.setViewdealEntity(selViewDeal);
                dealEntity.setPropertyEntity(selProperty);
                dealEntity.setParampropertyEntity(selPropertyParam);
                dealEntity.setEmployeesEntity(selEmployee);
                dealEntity.setDealSum(Double.parseDouble(dealSum));
                dealEntity.setDealPercent(Double.parseDouble(dealPercent));
                dealDao.update(dealEntity);
            } else {
                dealEntity = new DealEntity();
                dealEntity.setDateDeal(new Date(simpleDateFormat.parse(dateDeal).getTime()));
                dealEntity.setClientsEntity1(selClients1);
                dealEntity.setClientsEntity2(selClients2);
                dealEntity.setViewdealEntity(selViewDeal);
                dealEntity.setPropertyEntity(selProperty);
                dealEntity.setParampropertyEntity(selPropertyParam);
                dealEntity.setEmployeesEntity(selEmployee);
                dealEntity.setDealSum(Integer.parseInt(dealSum));
                dealEntity.setDealPercent(Integer.parseInt(dealPercent));
                dealDao.insert(dealEntity);
            }
        } catch (Exception e) {
            req.setAttribute("ERROR", "Предыдущее действие завершилось с ошибкой. Данные не были  добавлены");
        }
        return PageURL.LIST_DEAL_ACTION;
    }
}
