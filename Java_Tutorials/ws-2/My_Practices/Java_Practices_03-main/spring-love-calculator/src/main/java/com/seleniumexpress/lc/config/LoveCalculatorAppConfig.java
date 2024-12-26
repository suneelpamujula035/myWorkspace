package com.seleniumexpress.lc.config;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.seleniumexpress.lc.formatter.Phone_Number_Formatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.lc.controllers")
@PropertySources({@PropertySource("classpath:email.properties"),@PropertySource("classpath:messages.properties")})
public class LoveCalculatorAppConfig implements WebMvcConfigurer {// WebMvcConfigurer

	@Autowired
	private Environment env;
	
	
	Logger logger = Logger.getLogger(LoveCalculatorAppConfig.class.getName());

	@Bean
	public InternalResourceViewResolver viewResolver() {
		// set up view resolver
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean // ( name = "messageSource")
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		return localValidatorFactoryBean;
	}

	@Bean
	public JavaMailSenderImpl getJavaMailSender() {

		logger.info(">>>>>>>>>>>Fetching the host value "+env.getProperty("mail.host"));
		
		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost(env.getProperty("mail.host"));// Fetching values from properties file
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
		javaMailSenderImpl.setPort(getIntProperty("mail.port"));

		javaMailSenderImpl.setJavaMailProperties(getMailProperty());

		return javaMailSenderImpl;
	}

	private Properties getMailProperty() {// Loading properties to mail
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		return mailProperties;
	}

	int getIntProperty(String key)// Converting from Integer to String
	{
		String property = env.getProperty(key);
		return Integer.parseInt(property);
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {

		System.out.println("Inside addFormatters method");
		registry.addFormatter(new Phone_Number_Formatter());
	}

	@Override
	public Validator getValidator() {

		return validator();
	}
}
