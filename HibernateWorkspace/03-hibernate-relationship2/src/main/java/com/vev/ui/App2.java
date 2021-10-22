package com.vev.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Course;
import com.vev.entity.Student;

public class App2 {

	public static void main(String[] args) {

		// configuration
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Course.class);
		configuration.addAnnotatedClass(Student.class);

		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// creating a session
		Session session = sessionFactory.openSession();
		Course course = session.get(Course.class, 7L);
		if (course != null) {
			System.out.println(course);
			System.out.println("---------------------------------------");
			course.getStudents().forEach(System.out::println);
		} else {
			System.out.println("course not found");
		}
		session.close();
		sessionFactory.close();

	}

}
