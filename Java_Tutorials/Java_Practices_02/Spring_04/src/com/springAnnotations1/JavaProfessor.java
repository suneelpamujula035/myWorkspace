package com.springAnnotations1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class JavaProfessor implements Professor {

	public void teach() {

		System.out.println("Hiiii students Im a Java Specialist");
	}

}
