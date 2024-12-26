package com.hibernate.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Player;

public class HibernateMain {

	public static void main(String[] args) {

		try {
		Configuration con = new Configuration().configure().addAnnotatedClass(com.hibernate.entity.Player.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory factory = con.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Player p1 = new Player(2, "Amit","CSK",19);
		session.save(p1);
		transaction.commit();
		session.clear();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
