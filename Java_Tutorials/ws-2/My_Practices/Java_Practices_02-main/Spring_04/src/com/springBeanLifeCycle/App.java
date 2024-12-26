package com.springBeanLifeCycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		dao.selectAllStudents();
		//dao.deleteStudent(3);
		((AbstractApplicationContext) context).close();
	}

}
