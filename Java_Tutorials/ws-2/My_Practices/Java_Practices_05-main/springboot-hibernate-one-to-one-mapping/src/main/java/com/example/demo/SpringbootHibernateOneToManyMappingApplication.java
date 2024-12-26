package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonDetails;
import com.example.demo.repository.PersonRepository;

@SpringBootApplication
public abstract class SpringbootHibernateOneToManyMappingApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		PersonDetails suneelDetails = new PersonDetails();
		suneelDetails.setZipCode(524101);
		suneelDetails.setJob("Java Developer");
		suneelDetails.setSalary(45000.56);
		
		Person suneel = new Person();
		suneel.setPrrsonName("Pamujula Suneel Kumar");
		suneel.setpDetails(suneelDetails);
		
		personRepo.save(suneel);

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToManyMappingApplication.class, args);
	}

	
	

}
