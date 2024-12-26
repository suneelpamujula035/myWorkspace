package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;

@SpringBootApplication
public class SpringbootHibernateOneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepo;

	@Override
	public void run(String... args) throws Exception {

		Post post = new Post("one to many mapping", "one to many mapping using JPA and Hibernate");

		Comment comment1 = new Comment("Very useful");
		Comment comment2 = new Comment("Informative");
		Comment comment3 = new Comment("Great Post");

		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		postRepo.save(post);

		Post post2 = new Post("many to many mapping", "many to many mapping using JPA and Hibernate");

		Comment comment4 = new Comment("super");
		Comment comment5 = new Comment("nice");
		Comment comment6 = new Comment("awesome");

		post2.getComments().add(comment4);
		post2.getComments().add(comment5);
		post2.getComments().add(comment6);
		
		postRepo.save(post2);
		
		Post post3 = new Post("Spring Boot", "spring Boot tutorials");

		Comment c1 = new Comment("readable");
		Comment c2 = new Comment("understandbla");
		Comment c3 = new Comment("mind blowing");
		Comment c4 = new Comment("readable");
		Comment c5 = new Comment("understandbla");

		post3.getComments().add(c1);
		post3.getComments().add(c2);
		post3.getComments().add(c3);
		post3.getComments().add(c4);
		post3.getComments().add(c5);
		
		postRepo.save(post3);

	}

}
