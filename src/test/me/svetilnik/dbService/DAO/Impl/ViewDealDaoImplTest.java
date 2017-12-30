package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViewDealDaoImplTest {
    @Test
    public void insert() throws Exception {
        ViewDealDaoImpl viewDealDao = new ViewDealDaoImpl();
        ViewdealEntity viewdealEntity = new ViewdealEntity();
        viewdealEntity.setViewDeal("viewDeal");
        viewDealDao.insert(viewdealEntity);
    }

    @Test
    public void delete() throws Exception {
        ViewDealDaoImpl dao = new ViewDealDaoImpl();
        ViewdealEntity entity = dao.getByViewDeal("viewDeal");
        dao.delete(entity);
    }

}