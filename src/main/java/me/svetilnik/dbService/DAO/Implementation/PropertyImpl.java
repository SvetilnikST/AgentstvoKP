package me.svetilnik.dbService.DAO.Implementation;

import me.svetilnik.dbService.DAO.interf.PropertyDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PropertyImpl implements PropertyDAO {
    private Session session = null;

    public PropertyImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public PropertyEntity getPropertyById(int id) {
        PropertyEntity propertyEntity = null;
        propertyEntity = (PropertyEntity) session.load(PropertyEntity.class,id);
        return propertyEntity;
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
    public List getAllProperty() throws SQLException, Exception{
        List record = new ArrayList();
        record = session.createCriteria(PropertyEntity.class).list();
        return record;
    }
}
