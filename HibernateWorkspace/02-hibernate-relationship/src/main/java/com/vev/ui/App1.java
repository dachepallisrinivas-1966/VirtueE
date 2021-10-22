package com.vev.ui;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Employee;
import com.vev.entity.Laptop;

public class App1 {

	public static void main(String[] args) {
		
		// configuration
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Laptop.class);
		
		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.openSession();
		
		Laptop lap1 = new Laptop("HP");
		Employee emp1 = new Employee("Srinivas", "Dachepalli", lap1);
		
		Laptop lap2 = new Laptop("Lenovo");
		Employee emp2 = new Employee("Sai Pallavi", "Nemani", lap2);
		
		EntityTransaction txn = session.getTransaction();
		txn.begin();
		session.persist(emp1);
		session.persist(emp2);
		txn.commit();
		
		session.close();
		sessionFactory.close();
	}

}
