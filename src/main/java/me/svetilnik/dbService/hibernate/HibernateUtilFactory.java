package me.svetilnik.dbService.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtilFactory {
    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }
    private static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory( "me.svetilnik.dbService.hibernate" );
        }
        return emf;
    }
}