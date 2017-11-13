package me.svetilnik.dbService.DAO.Implementation;

import me.svetilnik.dbService.DAO.interf.ParamPropertyDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.ParampropertyEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParamPropertyImpl implements ParamPropertyDAO {
    private Session session = null;

    public ParamPropertyImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public ParampropertyEntity getParamPropertyById(int id) {
        ParampropertyEntity parampropertyEntity = null;
        parampropertyEntity = (ParampropertyEntity) session.load(ParampropertyEntity.class,id);
        return parampropertyEntity;
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
public List getAllParamProperty() throws SQLException,Exception{
        List record = new ArrayList();
        record = session.createCriteria(ParampropertyEntity.class).list();
        return record;
}
}
