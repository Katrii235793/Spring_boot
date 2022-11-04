package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Project1;
import com.example.service.Projservice;

@RestController
public class ProjController {
	

	
	@Autowired
	Projservice projservices;
	@PostMapping ("/addUsers")
	public List<Project1> addUsers(@RequestBody List<Project1> user){
		return projservices.CreateProject1(user);
	}
	
	@GetMapping("/user/{id}")
	public Project1 getUserById(@PathVariable int id) {
		return projservices.getUserById(id);
	}
	
	@GetMapping("/users")
	public List<Project1> getAllUsers() {
		return projservices.getUsers();
	}
	@PutMapping("/updateuser")
	public Project1 updateUser(@RequestBody Project1 user) {
		return projservices.updateUser(user);
	}

	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return projservices.deleteUserById(id);
	}
	
}

