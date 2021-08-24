package com.assignment1.userdata.controller;
import com.assignment1.userdata.exception.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment1.userdata.entity.User;
import com.assignment1.userdata.exception.RecordNotFoundException;
import com.assignment1.userdata.service.UserService;

@RestController
public class ProductController {
	@Autowired
	private UserService service;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User u1)
	{
		return service.saveInfo(u1);
	}
	
	@PostMapping("/addusers")

	public List<User> addUsers(@RequestBody List<User> u1)
	{
		return service.saveInfos(u1);
	}
	
	@GetMapping("/users")
	public List<User> findallusers(){
		return service.getInfo();
	}
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable long id)
	{
		return service.getInfoById(id);
	}
	
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User u1) throws RecordNotFoundException
	{
		return service.updateInfo(u1);
	}
	
	

}
