package me.svetilnik.agentstvo.servlet.controller.command;

import me.svetilnik.agentstvo.servlet.controller.ActionCommand;
import me.svetilnik.agentstvo.servlet.controller.PageURL;
import me.svetilnik.dbService.DAO.Impl.*;
import me.svetilnik.dbService.hibernate.model.dataSet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EditDealCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DealDaoImpl dealDao = new DealDaoImpl();

        ClientsDaoImpl clientsDao1 = new ClientsDaoImpl();
        List<ClientsEntity> clientsEntities1 = clientsDao1.getAll(0,0);

        ClientsDaoImpl clientsDao2 = new ClientsDaoImpl();
        List<ClientsEntity> clientsEntities2 = clientsDao2.getAll(0,0);

        ViewDealDaoImpl viewDealDao = new ViewDealDaoImpl();
        List<ViewdealEntity> viewdealEntities = viewDealDao.getAll(0,0);

        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        List<PropertyEntity> propertyEntities = propertyDao.getAll(0,0);

        ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();
        List<ParampropertyEntity> parampropertyEntities = paramPropertyDao.getAll(0,0);

        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
        List<EmployeesEntity> employeesEntities = employeesDao.getAll(0,0);

        String idDeal = req.getParameter("id");
        DealEntity dealEntity = null;

        if( !idDeal.isEmpty()) {
            dealEntity = dealDao.getById(Long.parseLong(idDeal));
        }else {
            dealEntity = new DealEntity();
        }
        req.setAttribute("dealEntity",dealEntity);

        req.setAttribute("curClients1", dealEntity.getClientsEntity1().getIdClients());
        req.setAttribute("curClients2", dealEntity.getClientsEntity2().getIdClients());
        req.setAttribute("curViewDeal", dealEntity.getViewdealEntity().getIdViewDeal());
        req.setAttribute("curProperty", dealEntity.getPropertyEntity().getIdProperty());
        req.setAttribute("curParamProperty", dealEntity.getParampropertyEntity().getIdParamProperty());
        req.setAttribute("curEmployees", dealEntity.getEmployeesEntity().getIdEmployees());

        req.setAttribute("clientsEntities1", clientsEntities1);
        req.setAttribute("clientsEntities2", clientsEntities2);
        req.setAttribute("viewDealEntities", viewdealEntities);
        req.setAttribute("propertyEntities", propertyEntities);
        req.setAttribute("paramPropertyEntities", parampropertyEntities);
        req.setAttribute("employeesEntities", employeesEntities);


        req.setAttribute("mode", "edit");

        return PageURL.ADD_DEAL;
    }
}
