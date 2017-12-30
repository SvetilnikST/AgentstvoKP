package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class LocationDaoImpl {
    private EntityManager entityManager = null;

    public LocationDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<LocationEntity> getAll(int offcet, int limit) throws IOException {
        List<LocationEntity> result = entityManager.createQuery(
                "from LocationEntity " )
                .getResultList();
        return result;
    }


    public LocationEntity getById(long id) throws IOException {
        LocationEntity result = (LocationEntity) entityManager.createQuery(
                "select l from LocationEntity l " +
                        "where l.idLocation like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }

    public LocationEntity getByName(String name) throws IOException {
        LocationEntity result = (LocationEntity) entityManager.createQuery(
                "select l from LocationEntity l " +
                        "where l.locationFlat like :name ")
                .setParameter("name", name)
                .getSingleResult();
        return result;
    }
    public void insert(LocationEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(LocationEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }


    public void update(LocationEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

}
