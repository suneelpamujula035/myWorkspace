package com.caching.DemoHib_Caching_02;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	Alien a = null;
    	    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	Alien alien = (Alien) session1.get(Alien.class, 22);
    	System.out.println(alien);
    	session1.getTransaction().commit();
    	session1.close();
    	
    	Session session2 = sf.openSession();
    	session2.beginTransaction();
    	a = (Alien)session2.get(Alien.class, 22);
    	System.out.println(a);
    	session2.getTransaction().commit();
    	session2.close();
    	
    	//For opening total list of aliens
//    	Session session3 = sf.openSession();
//    	session3.beginTransaction();
//    	Query<Alien> query = session3.createQuery("from Alien", Alien.class);
//    	List<Alien> alienList = query.getResultList();
//    	for(Alien tempAliens:alienList)
//    	{
//    		System.out.println("Alien record "+tempAliens);
//    	}
//    	session3.getTransaction().commit();
//    	session3.close();
    	
    }
}
