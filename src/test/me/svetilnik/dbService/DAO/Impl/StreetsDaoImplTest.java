package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class StreetsDaoImplTest {
    @Test
    public void insert() throws Exception {
        StreetsDaoImpl streetsDao = new StreetsDaoImpl();
        StreetsEntity streetsEntity = new StreetsEntity();
        streetsEntity.setStreetsName("StreetsName");
        streetsDao.insert(streetsEntity);
    }

    @Test
    public void delete() throws Exception {
        StreetsDaoImpl dao = new StreetsDaoImpl();
        StreetsEntity entity = dao.getByName("StreetsName");
        dao.delete(entity);
    }

}