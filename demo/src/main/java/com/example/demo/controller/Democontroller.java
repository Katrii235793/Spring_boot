package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Demo;
import com.example.service.DemoService;



@RestController

public class Democontroller {
@Autowired
DemoService demoservices;
@PostMapping ("/addproduct")
public List<Demo> addproduct(@RequestBody List<Demo> product){
	return demoservices.saveproducts(product);
}

@GetMapping("/products")
public List<Demo> findAllProducts(){
	return demoservices.getProduct();
}
}
