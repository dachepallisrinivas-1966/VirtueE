package com.vev.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vev.entity.ContractEmployee;
import com.vev.entity.Employee;
import com.vev.entity.Manager;

public class App1 {

	public static void main(String[] args) {
		// configuration
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Manager.class);
		configuration.addAnnotatedClass(ContractEmployee.class);

		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// creating a session
		Session session = sessionFactory.openSession();

		Employee emp = new Employee(1L, "Srinivas", 50000.0);
		Manager mgr = new Manager(2L, "Divya", 65000.0, 10000.0);
		ContractEmployee cemp = new ContractEmployee(3L, "Ramana", 25000.0, 45);

		Transaction txn = session.getTransaction();
		txn.begin();
		session.persist(emp);
		session.persist(mgr);
		session.persist(cemp);
		txn.commit();

		session.close();
		sessionFactory.close();

	}

}
