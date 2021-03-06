package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;
import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class PropertyDaoImpl {
    private EntityManager entityManager = null;
    public PropertyDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<PropertyEntity> getAll(int offcet, int limit) throws IOException {
        List<PropertyEntity> result = entityManager.createQuery(
                "from PropertyEntity " )
                .getResultList();
        return result;
    }

    public PropertyEntity getById(long id) throws IOException {
        PropertyEntity result = (PropertyEntity) entityManager.createQuery(
                "select l from PropertyEntity l " +
                        "where l.idProperty like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }

    public PropertyEntity getByProperty(String property) throws IOException {
        PropertyEntity result = (PropertyEntity) entityManager.createQuery(
                "select l from PropertyEntity l " +
                        "where l.property like :property ")
                .setParameter("property", property)
                .getSingleResult();
        return result;
    }
    public void insert(PropertyEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(PropertyEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public void update(PropertyEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

}
