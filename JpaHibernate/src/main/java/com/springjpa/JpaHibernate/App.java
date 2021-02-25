package com.springjpa.JpaHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.springjpa.JpaHibernate.model.Technology;

public class App {
	public static void main(String[] args) {

		Technology tec = new Technology(104, "python", "1.8");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TH");
		EntityManager em = emf.createEntityManager();

		/*
		 * em.getTransaction().begin(); em.persist(tec); em.getTransaction().commit();
		 */
		Technology tech = em.find(Technology.class, 104);
		System.out.println(tech);

	}
}
