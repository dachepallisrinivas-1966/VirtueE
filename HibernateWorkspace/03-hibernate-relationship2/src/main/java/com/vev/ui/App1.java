package com.vev.ui;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Course;
import com.vev.entity.Student;

public class App1 {

	public static void main(String[] args) {

		// configuration
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Course.class);
		configuration.addAnnotatedClass(Student.class);

		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// creating a session
		Session session = sessionFactory.openSession();
		Course c1 = new Course("oracle");
		Course c2 = new Course("java");

		Student s1 = new Student("raghu");
		Student s2 = new Student("divya");
		Student s3 = new Student("pravan");
		Student s4 = new Student("sudha");

		Set<Student> javaStudents = new LinkedHashSet<>();
		javaStudents.add(s2);
		javaStudents.add(s4);

		Set<Student> oracleStudents = new LinkedHashSet<>();
		oracleStudents.add(s1);
		oracleStudents.add(s3);

		c1.setStudents(oracleStudents);
		c2.setStudents(javaStudents);

		s1.setCourse(c1);
		s2.setCourse(c2);
		s3.setCourse(c1);
		s4.setCourse(c2);

		Transaction txn = session.getTransaction();
		txn.begin();
		session.persist(c1);
		session.persist(c2);
		txn.commit();

	}

}
