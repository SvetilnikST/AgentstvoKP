package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.IOException;
import java.util.List;

public class ClientsDaoImpl {
    private Session session = null;

    public ClientsDaoImpl(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public List<ClientsEntity> getAll(int offcet, int limit) throws IOException {
        Criteria criteria;

        criteria = session.createCriteria(ClientsEntity.class);
        return (List<ClientsEntity>) criteria.list();
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
