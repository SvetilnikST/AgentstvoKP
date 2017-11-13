package me.svetilnik.dbService.DAO.Implementation;

import me.svetilnik.dbService.DAO.interf.LocationDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocationImpl implements LocationDAO {

    private Session session=null;

    private LocationImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public LocationEntity getLocationById(int id) {
        LocationEntity locationEntity = null;
        locationEntity = (LocationEntity) session.load(LocationEntity.class,id);
        return locationEntity;
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
    }

    @Override
    public List getAllObjects() {
        throw new UnsupportedOperationException("Not supported yet.");
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

    public List getAllLocation() throws SQLException, Exception{
        List record = new ArrayList();
        record = session.createCriteria(LocationEntity.class).list();
        return record;
    }
}
