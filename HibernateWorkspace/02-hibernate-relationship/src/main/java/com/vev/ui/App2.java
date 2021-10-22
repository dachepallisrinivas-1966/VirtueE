package com.vev.ui;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Employee;
import com.vev.entity.Laptop;

public class App2 {

	public static void main(String[] args) {
		// configuration
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Laptop.class);

		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// creating a session
		Session session = sessionFactory.openSession();
		
		Employee employee = session.get(Employee.class, 3L);
		
		if (employee != null) {
			EntityTransaction txn = session.getTransaction();
			txn.begin();
			session.remove(employee);
			txn.commit();
		} else {
			System.out.println("Employee not found");
		}

	}

}
