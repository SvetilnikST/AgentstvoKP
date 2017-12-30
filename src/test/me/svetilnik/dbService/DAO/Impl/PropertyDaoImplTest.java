package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyDaoImplTest {
    @Test
    public void insert() throws Exception {
        PropertyDaoImpl propertyDao = new PropertyDaoImpl();
        PropertyEntity propertyEntity = new PropertyEntity();
        propertyEntity.setProperty("Property");
        propertyDao.insert(propertyEntity);
    }

    @Test
    public void delete() throws Exception {
        PropertyDaoImpl dao = new PropertyDaoImpl();
        PropertyEntity entity = dao.getByProperty("Property");
        dao.delete(entity);
    }

}