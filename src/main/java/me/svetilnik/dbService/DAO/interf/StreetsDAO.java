package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.StreetsEntity;

public interface StreetsDAO extends Dao {

    StreetsEntity getStreetsById(int id);

}
