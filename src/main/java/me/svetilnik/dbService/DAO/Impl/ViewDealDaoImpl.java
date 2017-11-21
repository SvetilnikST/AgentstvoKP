package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class ViewDealDaoImpl {
    private Session session = null;

    public ViewDealDaoImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public List<ViewdealEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(ViewdealEntity.class);
//        criteria.add(Restrictions.eq("employeesMail", login));
//        criteria.add(Restrictions.eq("password", password));
//        List<StreetsEntity> result = session.

        return (List<ViewdealEntity>) criteria.list();
    }


    public ViewdealEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(ViewdealEntity.class);
        criteria.add(Restrictions.eq("idStreets",id));
        return (ViewdealEntity) criteria.uniqueResult();
    }


    public void insert(ViewdealEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

    // хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(ViewdealEntity.class);
        criteria.add(Restrictions.eq("idViewDeal",id));
        session.delete(criteria);
        return;
    }


    public void update(ViewdealEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(ViewdealEntity.class);

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
