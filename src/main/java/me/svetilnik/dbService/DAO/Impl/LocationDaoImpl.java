package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class LocationDaoImpl {
    private Session session = null;

    public LocationDaoImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public List<LocationEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(LocationEntity.class);

        return (List<LocationEntity>) criteria.list();
    }


    public LocationEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(LocationEntity.class);
        criteria.add(Restrictions.eq("idLocation",id));
        return (LocationEntity) criteria.uniqueResult();
    }


    public void insert(LocationEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

// хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(LocationEntity.class);
        criteria.add(Restrictions.eq("idLocation",id));
        session.delete(criteria);
        return;
    }


    public void update(LocationEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(LocationEntity.class);

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }


}
