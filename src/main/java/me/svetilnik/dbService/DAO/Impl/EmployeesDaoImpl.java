package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class EmployeesDaoImpl {
    private EntityManager entityManager = null;

    private Session session;
    public EmployeesDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<EmployeesEntity> getAll(int offcet, int limit) throws IOException {
        List<EmployeesEntity> result = entityManager.createQuery(
                "from EmployeesEntity " )
                .getResultList();

        return result;
    }

    public EmployeesEntity getById(long id) throws IOException {
        EmployeesEntity result = (EmployeesEntity) entityManager.createQuery(
                "select l from EmployeesEntity l " +
                        "where l.idEmployees like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }


    public void insert(EmployeesEntity entity) throws IOException {

        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(EmployeesEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }


    public void update(EmployeesEntity entity) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getNumOfRecords(String tableName) throws IOException {
       throw new UnsupportedOperationException("Not supported yet.");
//        return 0;
    }
}
