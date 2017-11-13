package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.ClientsEntity;

public interface ClientsDAO extends Dao {
    ClientsEntity getClientsByID(int id);
}
