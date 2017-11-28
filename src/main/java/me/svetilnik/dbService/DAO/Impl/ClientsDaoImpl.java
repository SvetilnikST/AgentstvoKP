package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class ClientsDaoImpl {

    private EntityManager entityManager = null;

    public ClientsDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<ClientsEntity> getAll(int offcet, int limit) throws IOException {
        List<ClientsEntity> result = entityManager.createQuery(
                "from ClientsEntity " )
                .getResultList();
        return result;
    }


    public ClientsEntity getById(int id) throws IOException {
        ClientsEntity result = (ClientsEntity) entityManager.createQuery(
                "select l from ClientsEntity l " +
                        "where l.idClients like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }


    public void insert(ClientsEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        ClientsEntity result = (ClientsEntity) entityManager.createQuery(
                "select l from LocationEntity l " +
                        "where l.idClients like :id ")
                .setParameter("id", id)
                .getSingleResult();
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public void update(ClientsEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
