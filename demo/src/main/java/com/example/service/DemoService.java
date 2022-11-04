package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Demo;
import com.example.repository.demoRepos;

public class DemoService {
	
	@Autowired
	demoRepos repo;

	public List<Demo> saveproducts(List<Demo> product) {
		// TODO Auto-generated method stub
		return repo.saveAll(product);
	}

	public List<Demo> getProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
