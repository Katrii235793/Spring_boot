package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Project1;
import com.example.repository.projRepos;

public class Projservice {
	@Autowired
	projRepos repo;

	public Project1 createUser(Project1 user) {
		return repo.save(user);
	}

	public List<Project1> saveproducts(List<Project1> user) {
		// TODO Auto-generated method stub
		 return repo.saveAll(user);
	}

	public List<Project1> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public Project1 getUserById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public List<Project1> getUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Project1 updateUser(Project1 user) {
		// TODO Auto-generated method stub
		Project1 oldUser=null;
		Optional<Project1 > optionaluser=repo.findById(user.getId());
		if(optionaluser.isPresent()) {
			oldUser=optionaluser.get();
			oldUser.setName(user.getName());
			oldUser.setAddr(user.getAddr());
			repo.save(oldUser);
		}else {
			return new Project1 ();
		}
		return oldUser;
	}
	

	public String deleteUserById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "User got deleted";
	}

	public List<Project1> CreateProject1(List<Project1> user) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
