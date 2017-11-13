package me.svetilnik.dbService.DAO.Implementation;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;
import org.hibernate.Session;

import me.svetilnik.dbService.DAO.interf.EmployeesDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeesImpl implements EmployeesDAO{

    private Session session = null;

    public EmployeesImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public EmployeesEntity getEmployeesById(int id) {
        EmployeesEntity employeesEntity = null;
        employeesEntity =(EmployeesEntity) session.load(EmployeesEntity.class, id);
        return employeesEntity;
    }

    @Override
    public void saveObject(Object entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteObject(Object entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteObject(Number id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getObject(Number id) {
        return null;
    }

    @Override
    public List getAllObjects() {
        return null;
    }

    @Override
    public int getAllObjectsCount() {
        return 0;
    }

    @Override
    public List getObjects(String request, Object[] values) {
        return null;
    }

    public List getAllEmployees() throws SQLException, Exception{
        List record = new ArrayList();
        record = session.createCriteria(EmployeesEntity.class).list();
        return record;
    }

}
