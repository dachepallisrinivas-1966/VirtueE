package com.vev.ui;


import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vev.entity.Job;
import com.vev.util.HibernateUtil;

public class App1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		// creating a session
		Session session = sessionFactory.openSession();

		// Query<Job> query = session.createQuery("from Job", Job.class);
		// List<Job> jobs = query.list();
		
		// 1. TypedQuery<Job> query = session.createQuery("from Job", Job.class);
		// 2. TypedQuery<Job> query = session.createQuery("from Job j WHERE j.jobTitle like '%Manager'", Job.class);
		
		TypedQuery<Job> query = session.createQuery("from Job j WHERE j.jobId = 'AD_VP'", Job.class);
		// List<Job> jobs = query.getResultList();
		// jobs.forEach(System.out::println);
		
		Job job = query.getSingleResult();
		System.out.println(job);
		
		HibernateUtil.shutdown();

	}

}
