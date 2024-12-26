package com.springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Autowiring1.MathsTeacher;

@Configuration
//@ComponentScan(basePackages = "com.springAnnotations")
public class CollegeConfig {

	@Bean
	public Teacher mathsTeaching()
	{
		return new MathsTeacher();
	}
	@Bean(name = {"colBean", "colBeanObj"})//We can also specify many bean id's here we can call with any id
	public College collegeBean()//collegeBean - bean id
	{
		//College college = new College(new Principal());//For constructor dependency injection
		College college = new College();
		college.setPrincipal(principalBean());//For setter method dependency injection
		college.setTeacher(mathsTeaching());

		return college;
		//return new College();
	}
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
}
