package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.LocationEntity;

public interface LocationDAO extends Dao{
    LocationEntity getLocationById(int id);

}
