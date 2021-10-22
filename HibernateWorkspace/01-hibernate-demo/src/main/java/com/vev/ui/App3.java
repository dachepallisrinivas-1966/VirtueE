package com.vev.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Song;

public class App3 {

	public static void main(String[] args) {
		
		// configuration
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Song.class);
		
		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Song song = session.get(Song.class, 2);
		song.setName("Kal ho na ho - 3");
		song.setArtist("Sonu");
		session.update(song);
		session.getTransaction().commit();
		
		
		session.close();
		
		
		
		
	
		
		sessionFactory.close();
		
		
		

	}

}
