package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class PositionsDaoImpl {
    private EntityManager entityManager = null;
    public PositionsDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }
    public List<PositionsEntity> getAll(int offcet, int limit) throws IOException {
        List<PositionsEntity> result = entityManager.createQuery(
                "from PositionsEntity " )
                .getResultList();
        return result;
    }

    public PositionsEntity getById(long id) throws IOException {
        PositionsEntity result = (PositionsEntity) entityManager.createQuery(
                "select l from PositionsEntity l " +
                        "where l.idPositions like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }


    public void insert(PositionsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    // хз сработает ли проверить потом!
    public void delete(PositionsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }


    public void update(PositionsEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
