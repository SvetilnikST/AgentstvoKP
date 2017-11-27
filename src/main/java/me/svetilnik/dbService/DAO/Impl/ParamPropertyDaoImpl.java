package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.ParampropertyEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class ParamPropertyDaoImpl {
    private Session session = null;

    public ParamPropertyDaoImpl(){
        session = null;
    }

    public List<ParampropertyEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(ParampropertyEntity.class);

        return (List<ParampropertyEntity>) criteria.list();
    }


    public ParampropertyEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(ParampropertyEntity.class);
        criteria.add(Restrictions.eq("idParamProperty",id));
        return (ParampropertyEntity) criteria.uniqueResult();
    }


    public void insert(ParampropertyEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

// хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(ParampropertyEntity.class);
        criteria.add(Restrictions.eq("idParamProperty",id));
        session.delete(criteria);
        return;
    }


    public void update(ParampropertyEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(ParampropertyEntity.class);

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }


}
