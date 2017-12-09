package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.*;
import me.svetilnik.dbService.hibernate.model.dataSet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


public class AddDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        DealDaoImpl dealDao = new DealDaoImpl();

        HttpSession session = req.getSession(false);
//        String user_id =session.getAttribute("user_id").toString();
        String user_id = "1";

        ClientsDaoImpl clientsDao = new ClientsDaoImpl();
        List<ClientsEntity> clientsEntities = clientsDao.getAll(0,0);


        ViewDealDaoImpl viewDealDao = new ViewDealDaoImpl();
        List<ViewdealEntity> viewdealEntities = viewDealDao.getAll(0,0);

        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        List<PropertyEntity> propertyEntities = propertyDao.getAll(0,0);

        ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();
        List<ParampropertyEntity> parampropertyEntities = paramPropertyDao.getAll(0,0);

        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
        List<EmployeesEntity> employeesEntities = employeesDao.getAll(0,0);

        String curEmployees = "-1";
        if (!user_id.isEmpty()){
            curEmployees = ((Long)employeesDao.getById(Long.parseLong(user_id)).getIdEmployees()).toString();
        }


        DealEntity dealEntity = new DealEntity();

        req.setAttribute("id", "");
        req.setAttribute("dealEntity", dealEntity);
        req.setAttribute("clientsEntities", clientsEntities);
        req.setAttribute("viewDealEntities", viewdealEntities);
        req.setAttribute("propertyEntities", propertyEntities);
        req.setAttribute("parampropertyEntities", parampropertyEntities);
        req.setAttribute("employeesEntities", employeesEntities);

        req.setAttribute("curClients1", "-1");
        req.setAttribute("curClients2", "-1");
        req.setAttribute("curViewDeal", "-1");
        req.setAttribute("curProperty", "-1");
        req.setAttribute("curParamProperty", "-1");
        req.setAttribute("curEmployees", curEmployees);

        req.setAttribute("mode", "create"); //добавлено
        return PageURL.ADD_DEAL;
    }
}
