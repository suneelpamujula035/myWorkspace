package com.seleniumexpress.expressdhaba.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.seleniumexpress.expressdhaba.entity.Menu;

@Repository
public class MenuDAOImpl implements MenuDAO {

	@Autowired
	private SessionFactory sessionFactory;
//	@Autowired
//	private LocalSessionFactoryBean localSessionFactoryBean;
	
	@Transactional
	public List<Menu> getMenu() {

//		SessionFactory sessionFactory = localSessionFactoryBean.getObject();
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		List<Menu> menuList = session.createQuery("from Menu").getResultList();
		//session.getTransaction().commit();
		
		return menuList;
	}

}
