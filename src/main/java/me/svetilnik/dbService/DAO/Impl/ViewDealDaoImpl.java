package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class ViewDealDaoImpl {
    private EntityManager entityManager = null;

    public ViewDealDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<ViewdealEntity> getAll(int offcet, int limit) throws IOException {
        List<ViewdealEntity> result = entityManager.createQuery(
                "from ViewdealEntity " )
                .getResultList();
        return result;
    }


    public ViewdealEntity getById(int id) throws IOException {
        ViewdealEntity result = (ViewdealEntity) entityManager.createQuery(
                "select l from ViewdealEntity l " +
                        "where l.idViewDeal like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }


    public void insert(ViewdealEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        ViewdealEntity result = (ViewdealEntity) entityManager.createQuery(
                "select l from ViewdealEntity l " +
                        "where l.idViewDeal like :id ")
                .setParameter("id", id)
                .getSingleResult();
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public void update(ViewdealEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
