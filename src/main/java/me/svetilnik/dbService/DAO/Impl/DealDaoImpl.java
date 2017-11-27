package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import me.svetilnik.dbService.hibernate.model.dataSet.DealEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class DealDaoImpl {
    private Session session = null;
    private EntityManager entityManager = null;


    public DealDaoImpl(){
        session = null;
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<DealEntity> getAll(int offcet, int limit) throws IOException {
        List<DealEntity> result = entityManager.createQuery(
                "from DealEntity " )
                .getResultList();
        return result;
    }


    public DealEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(ClientsEntity.class);
        criteria.add(Restrictions.eq("idDeal",id));
        return (DealEntity) criteria.uniqueResult();
    }


    public void insert(DealEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

    // хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(DealEntity.class);
        criteria.add(Restrictions.eq("idDeal",id));
        session.delete(criteria);
        return;
    }


    public void update(DealEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(DealEntity.class);

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
