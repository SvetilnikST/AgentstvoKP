package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionsDaoImplTest {
    @Test
    public void insert() throws Exception {
        PositionsDaoImpl positionsDao = new PositionsDaoImpl();
        PositionsEntity positionsEntity = new PositionsEntity();
        positionsEntity.setPositions("positions");
        positionsDao.insert(positionsEntity);
    }

    @Test
    public void delete() throws Exception {
        PositionsDaoImpl dao = new PositionsDaoImpl();
        PositionsEntity entity = dao.getByPosition("positions");
        dao.delete(entity);
    }

}