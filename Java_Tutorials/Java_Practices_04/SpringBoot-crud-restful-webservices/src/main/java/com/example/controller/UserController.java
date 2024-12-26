package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserRepository repo;
	
	// get all users
	@GetMapping
	public List<User> getAllUsers()
	{
		return repo.findAll();
	}
	
	// get user by id
	@GetMapping
	public User getUserById(@PathVariable (value="id") long id)
	{
		return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User not found with id : "+id));
	}
	
	// create user
	@PostMapping
	public void createUser(@RequestBody User user)
	{
	   repo.save(user);
	}
	// update user
	@PutMapping
	public void updateUser(@RequestBody User user, @PathVariable (value="id") long id)
	{
		User existingUser = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User not found with id : "+id));
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		
		repo.save(existingUser);
	}
	
	// delete user by id
	@DeleteMapping
	public ResponseEntity<User> deleteUser(@PathVariable (value="id") long id)
	{
		User existingUser = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User not found with id : "+id));
        repo.delete(existingUser);
        return ResponseEntity.ok().build();
	}
	
}
