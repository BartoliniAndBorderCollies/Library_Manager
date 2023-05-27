package org.example.database;

import jakarta.persistence.EntityManager;
import org.example.entity.Account;
import org.hibernate.SessionFactory;

public class AccountRepository {

    private final Account account;
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private final EntityManager entityManager = sessionFactory.createEntityManager();

    public AccountRepository(Account account) {
        this.account = account;
    }

    public void create() {
        entityManager.getTransaction().begin();
        entityManager.persist(account);
        entityManager.getTransaction().commit();
    }

}
