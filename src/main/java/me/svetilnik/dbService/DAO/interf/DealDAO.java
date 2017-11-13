package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.DealEntity;

public interface DealDAO extends Dao{
    DealEntity getDealyId(int id);
}
