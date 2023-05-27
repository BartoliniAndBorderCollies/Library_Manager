package org.example;

import org.example.database.HibernateUtil;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Check database version (because there is nothing else in database)
        String sql = "select version()";

        String result = (String) session.createNativeQuery(sql).getSingleResult();
        System.out.println(result);
        session.close();

        HibernateUtil.shutdown();
    }

}