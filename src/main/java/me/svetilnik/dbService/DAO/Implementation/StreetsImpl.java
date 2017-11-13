package me.svetilnik.dbService.DAO.Implementation;


import me.svetilnik.dbService.DAO.interf.StreetsDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StreetsImpl implements StreetsDAO {

    private Session session = null;

    public StreetsImpl(){
    session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public StreetsEntity getStreetsById(int id) {
        StreetsEntity streetsEntity = null;
        streetsEntity = (StreetsEntity) session.load(StreetsEntity.class,id);
        return streetsEntity;
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
    throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getObject(Number id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAllObjects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getAllObjectsCount() {
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getObjects(String request, Object[] values) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public List getAllStreets() throws SQLException, Exception{
        List record = new ArrayList();
        record = session.createCriteria(StreetsEntity.class).list();
        return record;
    }
}
