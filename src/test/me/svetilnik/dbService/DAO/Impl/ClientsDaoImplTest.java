package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;
import org.junit.Test;

import static org.junit.Assert.*;


public class ClientsDaoImplTest {
    @Test
    public void insert() throws Exception {
        ClientsDaoImpl clientsDao = new ClientsDaoImpl();
        ClientsEntity clientsEntity = new ClientsEntity();
        clientsEntity.setSnmClients("snmClients");
        clientsEntity.setFloor("floor");
        clientsEntity.setPassportClients("passportClients");
        clientsEntity.setPhoneClients("phoneClients");
        clientsDao.insert(clientsEntity);
    }

    @Test
    public void delete() throws Exception {
        ClientsDaoImpl dao = new ClientsDaoImpl();
        ClientsEntity entity = dao.getBySNM("snmClients");
        dao.delete(entity);
    }

}