package com.seleniumexpress.expressdhaba.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.seleniumexpress.expressdhaba.controllerss"})
@EnableTransactionManagement
public class ExpressAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/view/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
	
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/restraunt?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
//	@Bean
//	LocalSessionFactoryBean getSessionFactory()//LocalSessionFactoryBean class gives session factory object and will connect DB interface
//	{
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();//Creating session factory onject
//		sessionFactory.setDataSource(getDataSource());
//		sessionFactory.setPackagesToScan("com.seleniumexpress.expressdhaba.entity");
//		sessionFactory.setHibernateProperties(getHibernateProperties());
//		return sessionFactory;
//	}
//	
//	public Properties getHibernateProperties()//DriverManagerDataSource is a simple implementation of database and gives us data source
//	{
//		Properties hibernateProperties = new Properties();
//		hibernateProperties.SetProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
//		hibernateProperties.SetProperty("hibernate.show_sql","true");
//		
//		return hibernateProperties;
//	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager setTransactionManager(SessionFactory sessionFactory123){
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager(sessionFactory123);
		return hibernateTransactionManager;
	}
}
