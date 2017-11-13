package me.svetilnik.dbService.DAO.Implementation;

import me.svetilnik.dbService.DAO.interf.PositionsDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionsImpl implements PositionsDAO{
    private Session session = null;

    public PositionsImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public PositionsEntity getPositionsById(int id) {
        PositionsEntity positionsEntity = null;
        positionsEntity = (PositionsEntity) session.load(PositionsEntity.class,id);
        return positionsEntity;
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
        throw new UnsupportedOperationException("Not supported yet.");
//        return null;
    }

    @Override
    public List getAllObjects() {
        throw new UnsupportedOperationException("Not supported yet.");
//        return null;
    }

    @Override
    public int getAllObjectsCount() {
        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }

    @Override
    public List getObjects(String request, Object[] values) {
        throw new UnsupportedOperationException("Not supported yet.");
        //        return null;
    }

    public List getAllPositions() throws SQLException,Exception{
        List record = new ArrayList();
        record = session.createCriteria(PositionsEntity.class).list();
        return record;
    }
}
