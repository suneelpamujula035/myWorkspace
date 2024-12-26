package com.springAnnotations1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Institute {

	@Value("${Institute.instituteName}")
	private String instituteName;
	@Autowired
	private Founder founder;
	@Autowired
	@Qualifier("javaProfessor")
	private Professor professor;
	
	public void details()
	{
		System.out.println("My institute name is :"+instituteName);
		founder.founderInfo();
		professor.teach();
	}
}
