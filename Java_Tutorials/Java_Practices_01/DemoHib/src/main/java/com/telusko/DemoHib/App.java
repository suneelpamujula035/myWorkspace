package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	Alien_Name an = new Alien_Name();
    	an.setFname("Pamujula");
    	an.setMname("Suneel");
    	an.setLname("Kumar");
    	Alien telusko = new Alien();
    	telusko.setAid(104);
    	telusko.setAname(an);
    	telusko.setAcolor("Yellow");
    	
    	    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(telusko);//Non-select Query
    	//telusko = (Alien)session.get(Alien.class, 103);//Select Query
    	tx.commit();
    	//session.beginTransaction().commit();
    	System.out.println(telusko);
    }
}
