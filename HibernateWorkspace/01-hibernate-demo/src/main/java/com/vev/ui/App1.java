package com.vev.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vev.entity.Song;

public class App1 {

	public static void main(String[] args) {
		
		// configuration
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);
		
		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.openSession();
		
		Song song1 = new Song();
		song1.setSongid(2);
		song1.setName("Kal ho na ho");
		song1.setArtist("Sonu nigam");
		
		session.beginTransaction();
		session.save(song1);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}

}
