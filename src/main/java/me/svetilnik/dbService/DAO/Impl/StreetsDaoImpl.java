package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.agentstvo.servlet.model.Model;
//import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class StreetsDaoImpl {
    private Session session = null;

    public StreetsDaoImpl(){
        session = null;
    }

    public List<StreetsEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(StreetsEntity.class);
//        criteria.add(Restrictions.eq("employeesMail", login));
//        criteria.add(Restrictions.eq("password", password));

//        List<StreetsEntity> result = session.

        return (List<StreetsEntity>) criteria.list();
    }


    public StreetsEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(StreetsEntity.class);
        criteria.add(Restrictions.eq("idStreets",id));
        return (StreetsEntity) criteria.uniqueResult();
    }


    public void insert(StreetsEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

// хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(StreetsEntity.class);
        criteria.add(Restrictions.eq("idStreets",id));
        session.delete(criteria);
        return;
    }


    public void update(StreetsEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(StreetsEntity.class);

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }


}
