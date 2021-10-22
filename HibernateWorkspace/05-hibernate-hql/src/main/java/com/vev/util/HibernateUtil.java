package com.vev.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Job;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	private static Configuration configuration = null;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			configuration = new Configuration().configure();
			configuration.addAnnotatedClass(Job.class);
			sessionFactory = configuration.buildSessionFactory();
			
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
