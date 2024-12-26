package com.springAnnotations1;

import org.springframework.stereotype.Component;

@Component
public class PythonProfessor implements Professor {

	public void teach() {

		System.out.println("Hiiii Python Im a Java Specialist");

	}

}
