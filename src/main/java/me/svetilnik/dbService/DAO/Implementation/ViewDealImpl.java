package me.svetilnik.dbService.DAO.Implementation;

import me.svetilnik.dbService.DAO.interf.ViewDealDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewDealImpl implements ViewDealDAO {
    private Session session = null;

    public ViewDealImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public ViewdealEntity getViewDealById(int id) {
        ViewdealEntity viewdealEntity = null;
        viewdealEntity = (ViewdealEntity) session.load(ViewdealEntity.class,id);
        return viewdealEntity;
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
    public List getAllViewDeal() throws SQLException,Exception{
        List record = new ArrayList();
        record = session.createCriteria(ViewdealEntity.class).list();
        return record;
    }
}
