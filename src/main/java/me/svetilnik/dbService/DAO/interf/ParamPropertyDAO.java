package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.ParampropertyEntity;

public interface ParamPropertyDAO extends Dao {
    ParampropertyEntity getParamPropertyById(int id);
}
