package com.vev.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Song;

public class App2 {

	public static void main(String[] args) {
		
		// configuration
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Song.class);
		
		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.openSession();
		
		Song song = session.get(Song.class, 2);
		System.out.println(song);
		System.out.println(session.contains(song));
		
		// session.close();
		session.evict(song);
		
		
		System.out.println(session.contains(song));
		
		
		//Session session2 = sessionFactory.openSession();
		
	
		
		sessionFactory.close();
		
		
		

	}

}
