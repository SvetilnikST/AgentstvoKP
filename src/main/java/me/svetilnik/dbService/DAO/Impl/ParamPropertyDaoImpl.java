package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.ParampropertyEntity;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class ParamPropertyDaoImpl {
private EntityManager entityManager = null;

    public ParamPropertyDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<ParampropertyEntity> getAll(int offcet, int limit) throws IOException {
        List<ParampropertyEntity> result = entityManager.createQuery(
                "from ParampropertyEntity" )
                .getResultList();
        return result;
    }


    public ParampropertyEntity getById(long id) throws IOException {

        ParampropertyEntity result = (ParampropertyEntity) entityManager.createQuery(
                "select l from ParampropertyEntity l " +
                        "where l.idParamProperty like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }


    public void insert(ParampropertyEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(ParampropertyEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public void update(ParampropertyEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public int getNumOfRecords(String tableName) throws IOException {

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }


}
