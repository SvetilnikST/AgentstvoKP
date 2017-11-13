package me.svetilnik.dbService.DAO.Implementation;

import me.svetilnik.dbService.DAO.interf.ClientsDAO;
import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientsImpl implements ClientsDAO {

private Session session = null;

public ClientsImpl(){
    session = HibernateUtil.getSessionFactory().openSession();
}

    @Override
    public ClientsEntity getClientsByID(int id) {
    ClientsEntity clientsEntity = null;
    clientsEntity = (ClientsEntity) session.load(ClientsEntity.class,id);
    return clientsEntity;
    }

    @Override
    public void saveObject(Object entity) {
    throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteObject(Object entity) {
    throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteObject(Number id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getObject(Number id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAllObjects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getAllObjectsCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getObjects(String request, Object[] values) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getAllClients() throws SQLException, Exception{
    List record = new ArrayList();
    record = session.createCriteria(ClientsEntity.class).list();
    return record;
    }
}
