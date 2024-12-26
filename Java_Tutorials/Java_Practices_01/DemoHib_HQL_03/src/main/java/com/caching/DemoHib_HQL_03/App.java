package com.caching.DemoHib_HQL_03;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student2.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	session.beginTransaction();
    	
//    	Random r = new Random();
//    	for(int i=1; i<=50; i++)
//    	{
//    		Student2 s = new Student2();
//    	
//    		s.setRollno(i);
//    		s.setName("Name "+i);
//    		s.setMarks(i);
//    		s.setMarks(r.nextInt(100));
//    		session.save(s);
//    	}
    	Query q = session.createQuery("from Student2");
    	//Student2 stu = (Student2) q.uniqueResult();//For particular rows
    	//System.out.println(stu);

    	List<Student2> students = q.list();
    	
    	for(Student2 s:students)
    	{
    		System.out.println(s);
    	}
    	session.getTransaction().commit();
    }
}
