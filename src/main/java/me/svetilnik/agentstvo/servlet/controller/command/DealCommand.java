package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.*;
import me.svetilnik.dbService.hibernate.model.dataSet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        // отображение всех видов сделок
        ViewDealDaoImpl viewDealDao = new ViewDealDaoImpl();
        List<ViewdealEntity> viewdealEntityList = viewDealDao.getAll(0,0);

        //отображение недвижимости
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        List<PropertyEntity> propertyEntityList = propertyDao.getAll(0,0);

        //отображение клиентов
        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
        List<EmployeesEntity> employeesEntityList = employeesDao.getAll(0,0);

        ClientsDaoImpl clientsDao1 = new ClientsDaoImpl();
        List<ClientsEntity> clientsEntityList1 = clientsDao1.getAll(0,0);

        ClientsDaoImpl clientsDao2 = new ClientsDaoImpl();
        List<ClientsEntity> clientsEntityList2 = clientsDao2.getAll(0,0);

        String fromForm = req.getParameter("viewDeal");
        String fromForm1 = req.getParameter("property");
        String fromForm2 = req.getParameter("employee");
        String fromForm3 = req.getParameter("clients1");
        String fromForm4 = req.getParameter("clients2");

        Long idViewDeal =0L;
        Long idProperty =0L;
        Long idEmployee =0L;
        Long idClients1 =0L;
        Long idClients2 =0L;

        DealDaoImpl dealDao = new DealDaoImpl();

        try {
            idViewDeal = Long.parseLong(fromForm);
         }catch (Exception e){
            idViewDeal=-1L;
        }

        try {
            idEmployee = Long.parseLong(fromForm2);
        }catch (Exception e){
            idEmployee=-1L;
        }

        try {
            idProperty = Long.parseLong(fromForm1);
        }catch (Exception ex){
            idProperty=-1L;
        }
        try {
            idClients1 = Long.parseLong(fromForm3);

        }catch (Exception e){
            idClients1=-1L;
        }
        try {
            idClients2 = Long.parseLong(fromForm4);

        }catch (Exception e){
            idClients2=-1L;
        }

        if (idViewDeal<0 && idProperty<0 && idEmployee<0 && idClients1<0 && idClients2<0){
            List<DealEntity> dealEntities = dealDao.getAll(0,0);
            req.setAttribute("deal", dealEntities);
        }
        else if (idProperty>0){
            PropertyEntity oneproperty = propertyDao.getById(idProperty);
            req.setAttribute("deal", oneproperty.getDealEntities());
        }
        else if (idViewDeal>0){
            ViewdealEntity oneviewdeal = viewDealDao.getById(idViewDeal);
            req.setAttribute("deal", oneviewdeal.getDealEntities());
        }
        else if (idEmployee>0){
            EmployeesEntity oneemployee = employeesDao.getById(idEmployee);
            req.setAttribute("deal", oneemployee.getDealEntities());
        }
        else if (idClients1>0){
            ClientsEntity oneclients1 = clientsDao1.getById(idClients1);
            req.setAttribute("deal", oneclients1.getDealEntities1());

        }

        else if (idClients2>0){
            ClientsEntity oneclients2 = clientsDao2.getById(idClients2);
            req.setAttribute("deal", oneclients2.getDealEntities2());
        }
        req.setAttribute("title", "Cписок сделок");
        req.setAttribute("viewDeals", viewdealEntityList);
        req.setAttribute("propertys", propertyEntityList);
        req.setAttribute("employees", employeesEntityList);
        req.setAttribute("clients1", clientsEntityList1);
        req.setAttribute("clients2", clientsEntityList2);

        req.setAttribute("markdeal","1");
        return PageURL.DEAL_PAGE;
    }
}
