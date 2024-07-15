package com.sithuhantun;

import com.sithuhantun.model.Address;
import com.sithuhantun.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        oneToOne();
    }

    public static void oneToOne() {
        System.out.println("Maven + Hibernate + SQL One to One Mapping Annotations");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Address a1 = new Address("27th street", "NYC", "NY", 11103);
        Address a2 = new Address("28th street", "Buffalo", "NY", 15803);
        Teacher t1 = new Teacher("1000", "MHaseeb");
        Teacher t2 = new Teacher("2220", "Shahparan");
        t1.setAddress(a1);
        t2.setAddress(a2);
        session.persist(a1);
        session.persist(a2);
        session.persist(t1);
        session.persist(t2);
        t.commit();
        factory.close();
        session.close();
    }
}
