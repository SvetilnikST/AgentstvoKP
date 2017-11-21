package me.svetilnik.dbService.DAO;

import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

import me.svetilnik.agentstvo.servlet.model.UserRole;
//import me.svetilnik.dbService.hibernate.HibernateUtil;
import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.EmployeesEntity;
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;

public class AuthorizationDao {
    private EntityManager entityManager = null;

    public AuthorizationDao() {
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public UserRole checkAccess(String login, String password) throws IOException {
//        Criteria criteria;
        EmployeesEntity user = (EmployeesEntity) entityManager.createQuery(
                "select e from EmployeesEntity e " +
                        "where e.employeesMail like :employeesMail ")
                .setParameter("employeesMail", login)
                .getSingleResult();

//        criteria = session.createCriteria(EmployeesEntity.class);
//        criteria.add(Restrictions.eq("employeesMail", login));
//        criteria.add(Restrictions.eq("password", password));

//        EmployeesEntity user = (EmployeesEntity) criteria.uniqueResult();
        if (null != user) {
            String role_id = translateStatus(user.getStatus());
            if (login.equals(user.getEmployeesMail()) && password.equals(user.getPassword())) {
                return role_id.equalsIgnoreCase("admin") ? UserRole.admin : (role_id.equalsIgnoreCase("boss") ? UserRole.boss : UserRole.user);
            }
        }

        return null;
    }

    private String translateStatus(Integer status) {
        String statRet = "bad";
        switch (status) {
            case 10:
                statRet = "admin";
                break;
            case 20:
                statRet = "boss";
                break;
            case 30:
                statRet = "user";
                break;
        }
        return statRet;
    }

    public Long getUserId(String login) throws IOException {
        Long id = -1l;

//        Criteria criteria;
//
//        criteria = session.createCriteria(EmployeesEntity.class);
//        criteria.add(Restrictions.eq("employeesMail", login));
//
//        EmployeesEntity user = (EmployeesEntity) criteria.uniqueResult();
        EmployeesEntity user = (EmployeesEntity) entityManager.createQuery(
                "select e from EmployeesEntity e " +
                        "where e.employeesMail like :employeesMail ")
                .setParameter("employeesMail", login)
                .getSingleResult();

        if (user != null) {
            id = (long) user.getIdEmployees();
        }
        return id;
    }
}
