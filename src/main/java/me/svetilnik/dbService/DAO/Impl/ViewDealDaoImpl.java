package me.svetilnik.dbService.DAO.Impl;

import me.svetilnik.dbService.hibernate.HibernateUtilFactory;
import me.svetilnik.dbService.hibernate.model.dataSet.ViewdealEntity;
import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class ViewDealDaoImpl {
    private EntityManager entityManager = null;

    public ViewDealDaoImpl(){
        entityManager = HibernateUtilFactory.getEntityManager();
    }

    public List<ViewdealEntity> getAll(long offcet, long limit) throws IOException {
        List<ViewdealEntity> result = entityManager.createQuery(
                "from ViewdealEntity " )
                .getResultList();
        return result;
    }

    public ViewdealEntity getById(long id) throws IOException {
        ViewdealEntity result = (ViewdealEntity) entityManager.createQuery(
                "select l from ViewdealEntity l " +
                        "where l.id like :id ")
                .setParameter("id", id)
                .getSingleResult();
        return result;
    }

    public ViewdealEntity getByViewDeal(String viewDeal) throws IOException {
        ViewdealEntity result = (ViewdealEntity) entityManager.createQuery(
                "select l from ViewdealEntity l " +
                        "where l.viewDeal like :viewDeal ")
                .setParameter("viewDeal", viewDeal)
                .getSingleResult();
        return result;
    }

    public void insert(ViewdealEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(ViewdealEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
 }

    public void update(ViewdealEntity entity) throws IOException {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

}
