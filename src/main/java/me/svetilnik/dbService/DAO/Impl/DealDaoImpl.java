package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.DealEntity;

import javax.persistence.EntityManager;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

public class DealDaoImpl {
    private EntityManager entityManager = null;

    public DealDaoImpl() {
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<DealEntity> getAll(int offcet, int limit) throws IOException {
        List<DealEntity> result = entityManager.createQuery(
                "from DealEntity ")
                .getResultList();
        return result;
    }


    public List<DealEntity> getAllDate(Date firstDate, Date lastDate, int offcet, int limit) throws IOException {
        List<DealEntity> result = entityManager.createQuery(
                " select d from DealEntity d " +
                        "where d.dateDeal between :fd and :ld")
                .setParameter("fd", firstDate)
                .setParameter("ld", lastDate)
                .getResultList();
        return result;
    }

    public DealEntity getById(long id) throws IOException {
        DealEntity result = (DealEntity) entityManager.createQuery(
                "select l from DealEntity l " +
                        "where l.idDeal like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }

    public void insert(DealEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(DealEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public void update(DealEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

}
