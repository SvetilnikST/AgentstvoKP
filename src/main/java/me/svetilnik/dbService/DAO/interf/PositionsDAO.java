package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.PositionsEntity;

public interface PositionsDAO extends Dao {
    PositionsEntity getPositionsById(int id);
}
