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

        ClientsDaoImpl clientsDao = new ClientsDaoImpl();
        ViewDealDaoImpl viewDealDao = new ViewDealDaoImpl();
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();

        List<ClientsEntity> clientsEntities = clientsDao.getAll(0, 0);
        List<ViewdealEntity> viewdealEntities = viewDealDao.getAll(0, 0);
        List<PropertyEntity> propertyEntities = propertyDao.getAll(0, 0);
        List<EmployeesEntity> employeesEntities = employeesDao.getAll(0, 0);

        ParamPropertyDaoImpl paramPropertyDao = new ParamPropertyDaoImpl();
        List<ParampropertyEntity> parampropertyEntities = paramPropertyDao.getAll(0, 0);

        String idDeal = req.getParameter("id");
        DealEntity dealEntity = null;

        if (!idDeal.isEmpty()) {
            dealEntity = dealDao.getById(Long.parseLong(idDeal));

        } else {
            dealEntity = new DealEntity();
        }
        req.setAttribute("id", dealEntity.getIdDeal());
        req.setAttribute("dealEntity", dealEntity);

        req.setAttribute("clientsEntities", clientsEntities);
        req.setAttribute("viewDealEntities", viewdealEntities);
        req.setAttribute("propertyEntities", propertyEntities);
        req.setAttribute("employeesEntities", employeesEntities);
        req.setAttribute("parampropertyEntities", parampropertyEntities);


        req.setAttribute("curClients1", dealEntity.getClientsEntity1().getIdClients());
        req.setAttribute("curClients2", dealEntity.getClientsEntity2().getIdClients());
        req.setAttribute("curViewDeal", dealEntity.getViewdealEntity().getIdViewDeal());
        req.setAttribute("curProperty", dealEntity.getPropertyEntity().getIdProperty());
        req.setAttribute("curParamProperty", dealEntity.getParampropertyEntity().getIdParamProperty());
        req.setAttribute("curEmployee", dealEntity.getEmployeesEntity().getIdEmployees());

        req.setAttribute("mode", "edit");

        return PageURL.ADD_DEAL;
    }
}
