package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class ClientsDaoImpl {

    private EntityManager entityManager = null;

    public ClientsDaoImpl() {
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<ClientsEntity> getAll(int offcet, int limit) throws IOException {
        List<ClientsEntity> result = entityManager.createQuery(
                "from ClientsEntity ")
                .getResultList();
        return result;
    }


    public ClientsEntity getById(long id) throws IOException {
        ClientsEntity result = (ClientsEntity) entityManager.createQuery(
                "select l from ClientsEntity l " +
                        "where l.idClients like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }

    public ClientsEntity getBySNM(String snm) throws IOException {
        ClientsEntity result = (ClientsEntity) entityManager.createQuery(
                "select l from ClientsEntity l " +
                        "where l.snmClients like :snm ")
                .setParameter("snm", snm)
                .getSingleResult();
        return result;
    }

    public void insert(ClientsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }


    public void delete(ClientsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }


    public void update(ClientsEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }
}
