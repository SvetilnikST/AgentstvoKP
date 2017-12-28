package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class StreetsDaoImpl {
private EntityManager entityManager = null;

    public StreetsDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<StreetsEntity> getAll(int offcet, int limit) throws IOException {
        List<StreetsEntity> result = entityManager.createQuery(
                "from StreetsEntity" )
                .getResultList();
        return result;
    }

    public StreetsEntity getById(long id) throws IOException {
        StreetsEntity result = (StreetsEntity) entityManager.createQuery(
                "select l from StreetsEntity l " +
                        "where l.idStreets like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }

    public void insert(StreetsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(StreetsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public void update(StreetsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }
}
