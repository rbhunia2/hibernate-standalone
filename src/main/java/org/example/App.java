package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction =
                session.beginTransaction();

        Person person = new Person();
        person.setName("Raj");

        session.save(person);

        transaction.commit();
        session.close();
    }
}
