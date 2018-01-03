package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class PositionsDaoImpl {
    private EntityManager entityManager = null;

    public PositionsDaoImpl() {
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<PositionsEntity> getAll(int offcet, int limit) throws IOException {
        List<PositionsEntity> result = entityManager.createQuery(
                "from PositionsEntity ")
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

    public PositionsEntity getByPosition(String positions) throws IOException {
        PositionsEntity result = (PositionsEntity) entityManager.createQuery(
                "select l from PositionsEntity l " +
                        "where l.positions like :positions ")
                .setParameter("positions", positions)
                .getSingleResult();
        return result;
    }

    public void insert(PositionsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(PositionsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public void update(PositionsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

}
