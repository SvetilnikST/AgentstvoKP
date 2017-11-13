package me.svetilnik.dbService.DAO.interf;

import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;

public interface EmployeesDAO extends Dao {

    EmployeesEntity getEmployeesById(int id);

}
