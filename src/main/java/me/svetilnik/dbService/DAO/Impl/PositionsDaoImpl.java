package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class PositionsDaoImpl {
    private Session session = null;
    public PositionsDaoImpl(){
        session = null;
    }
    public List<PositionsEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PositionsEntity.class);
        return (List<PositionsEntity>) criteria.list();
    }

    public PositionsEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PositionsEntity.class);
        criteria.add(Restrictions.eq("idPositions",id));
        return (PositionsEntity) criteria.uniqueResult();
    }


    public void insert(PositionsEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

    // хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PositionsEntity.class);
        criteria.add(Restrictions.eq("idPositions",id));
        session.delete(criteria);
        return;
    }


    public void update(PositionsEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(PositionsEntity.class);
        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
