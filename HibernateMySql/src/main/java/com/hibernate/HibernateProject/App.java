package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernateProject.model.Techi;

public class App {
	public static void main(String[] args) {

		Configuration con = new Configuration().configure().addAnnotatedClass(Techi.class);

		// ServiceRegistry service=new S

		Techi tec = null;

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// save data into database using Hibernate save()
		// session.save(lap);

		tec = session.get(Techi.class, 103);
		System.out.println(tec);

		tec = session.get(Techi.class, 103);
		System.out.println(tec);
		/*
		 * Techi tech = session.get(Techi.class, 102); System.out.println(tech);
		 */
		tx.commit();
		session.close();

		Session session2 = sf.openSession();

		Transaction tx1 = session2.beginTransaction();

		// save data into database using Hibernate save()
		// session.save(lap);

		tec = session2.get(Techi.class, 103);
		System.out.println(tec);

		tec = session2.get(Techi.class, 103);
		System.out.println(tec);

		tx1.commit();
		session2.close();

	}
}
