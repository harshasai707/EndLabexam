package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Base Vehicle
        Vehicle vehicle = new Vehicle("General Vehicle", "Basic", 100, "White");
        session.save(vehicle);

        // Car instance
        Car car = new Car("Sedan", "Car", 200, "Red", 4);
        session.save(car);

        // Truck instance
        Truck truck = new Truck("Hauler", "Truck", 120, "Blue", 5000);
        session.save(truck);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Records inserted successfully.");
    }
}
