package com.UST.api.controller;

 

import java.util.List;

 

import javax.validation.Valid;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.UST.api.dto.UserRequest;
import com.UST.api.model.User;
import com.UST.api.service.UserService;

 

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService service;
    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userrequest)
    {
    	return new ResponseEntity<>(service.saveUser(userrequest),HttpStatus.CREATED);
    }
   
    
    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>>getAllUsers(){
        return ResponseEntity.ok(service.getAllUsers());
        
    }

 

}