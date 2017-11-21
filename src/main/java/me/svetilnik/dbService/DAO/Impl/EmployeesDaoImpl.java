package me.svetilnik.dbService.DAO.Impl;

//import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class EmployeesDaoImpl {
    private Session session = null;

    public EmployeesDaoImpl(){
//        session = HibernateUtil.getSessionFactory().openSession();
        session = null;
    }

    public List<EmployeesEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(EmployeesEntity.class);

        return (List<EmployeesEntity>) criteria.list();
    }


    public EmployeesEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(EmployeesEntity.class);
        criteria.add(Restrictions.eq("idEmployees",id));
        return (EmployeesEntity) criteria.uniqueResult();
    }


    public void insert(EmployeesEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

// хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(EmployeesEntity.class);
        criteria.add(Restrictions.eq("idEmployees",id));
        session.delete(criteria);
        return;
    }


    public void update(EmployeesEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(EmployeesEntity.class);

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }


}
