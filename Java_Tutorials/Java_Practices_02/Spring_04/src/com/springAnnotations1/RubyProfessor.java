package com.springAnnotations1;

import org.springframework.stereotype.Component;

@Component
public class RubyProfessor implements Professor {

	public void teach() {

		System.out.println("Hiiii students Im a Ruby Specialist");

	}

}
