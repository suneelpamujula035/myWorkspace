package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		//For xml based configuration
//		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
//		webApplicationContext.setConfigLocation("classpath:dad-frontcontroller-servlet.xml");
//		// create a dispatcher servlet object
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//		// register dispatchet servlet object
//		ServletRegistration.Dynamic myCustomDispatchetServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
//		myCustomDispatchetServlet.setLoadOnStartup(1);
//		myCustomDispatchetServlet.addMapping("/mywebsite.com/*");
		
//		//For annotation based configuration
//		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
//		webApplicationContext.register(LoveCalculatorAppConfig.class);
//		// create a dispatcher servlet object
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//		// register dispatchet servlet object
//		ServletRegistration.Dynamic myCustomDispatchetServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
//		myCustomDispatchetServlet.setLoadOnStartup(1);
//		myCustomDispatchetServlet.addMapping("/mywebsite.com/*");
	}

}
