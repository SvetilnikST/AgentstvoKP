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
    private Session session = null;
    private EntityManager entityManager = null;


    public ClientsDaoImpl(){
        session = null;
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<ClientsEntity> getAll(int offcet, int limit) throws IOException {
        List<ClientsEntity> result = entityManager.createQuery(
                "from ClientsEntity " )
                .getResultList();

        return result;
    }


    public ClientsEntity getById(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(ClientsEntity.class);
        criteria.add(Restrictions.eq("idClients",id));
        return (ClientsEntity) criteria.uniqueResult();
    }


    public void insert(ClientsEntity entity) throws IOException {
        session.save(entity);
        session.close();
    }

    // хз сработает ли проверить потом!
    public void delete(int id) throws IOException {
        Criteria criteria;
        criteria = session.createCriteria(ClientsEntity.class);
        criteria.add(Restrictions.eq("idClients",id));
        session.delete(criteria);
        return;
    }


    public void update(ClientsEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public int getNumOfRecords(String tableName) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(ClientsEntity.class);

        throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
