package me.svetilnik.dbService.DAO.Impl;

//import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class LocationDaoImpl {
//    private Session session = null;
    private EntityManager entityManager = null;

    public LocationDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<LocationEntity> getAll(int offcet, int limit) throws IOException {
//        Criteria criteria;

        List<LocationEntity> result = entityManager.createQuery(
                "from LocationEntity " )
                .getResultList();

        return result;
    }


    public LocationEntity getById(int id) throws IOException {
        LocationEntity result = (LocationEntity) entityManager.createQuery(
                "select l from LocationEntity l " +
                        "where l.idLocation like :id ")
                .setParameter("id", id)
                .getSingleResult();

        return result;
    }


    public void insert(LocationEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");    }

// хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        LocationEntity result = (LocationEntity) entityManager.createQuery(
                "select l from LocationEntity l " +
                        "where l.idLocation like :id ")
                .setParameter("id", id)
                .getSingleResult();
        throw new UnsupportedOperationException("Not supported yet.");
//        return;
    }


    public void update(LocationEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }


}
