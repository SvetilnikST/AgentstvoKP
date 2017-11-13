package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;

public interface ViewDealDAO extends Dao {
    ViewdealEntity getViewDealById(int id);
}
