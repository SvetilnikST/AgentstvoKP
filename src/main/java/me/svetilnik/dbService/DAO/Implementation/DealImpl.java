package me.svetilnik.dbService.DAO.Implementation;

import me.svetilnik.dbService.DAO.interf.DealDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.DealEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DealImpl implements DealDAO {

    private Session session = null;

    public DealImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public DealEntity getDealyId(int id) {
        DealEntity dealEntity = null;
        dealEntity = (DealEntity) session.load(DealEntity.class,id);
        return dealEntity;
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
    public List getAllDeal() throws SQLException,Exception{
        List record = new ArrayList();
        record = session.createCriteria(DealEntity.class).list();
        return record;
    }
}
