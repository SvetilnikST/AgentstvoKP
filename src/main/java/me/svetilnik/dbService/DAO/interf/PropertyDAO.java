package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.PropertyEntity;

public interface PropertyDAO extends Dao {
    PropertyEntity getPropertyById (int id);
}
