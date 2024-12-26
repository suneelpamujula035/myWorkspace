package com.caching.DemoHib_JPA_04;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Phone ph = new Phone();
    	ph.setPid(11);
    	ph.setPcompany("BlackBerry");
    	ph.setPcolor("skyblue");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(ph);//For Non-select queries
    	em.getTransaction().commit();
    	//Phone p = em.find(Phone.class,4);//For select queries
    	//System.out.println(p);
    }
}
