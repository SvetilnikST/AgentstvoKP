package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class PropertyDaoImpl {
    private Session session = null;
    public PropertyDaoImpl(){
        session = null;
    }
    public List<PropertyEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PropertyEntity.class);
        return (List<PropertyEntity>) criteria.list();
    }

    public PropertyEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PropertyEntity.class);
        criteria.add(Restrictions.eq("idProperty",id));
        return (PropertyEntity) criteria.uniqueResult();
    }

    public void insert(PropertyEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

    // хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PropertyEntity.class);
        criteria.add(Restrictions.eq("idProperty",id));
        session.delete(criteria);
        return;
    }


    public void update(PropertyEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PropertyEntity.class);
        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
