package com.assignment1.userdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.userdata.entity.User;
import com.assignment1.userdata.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User saveInfo(User u1)
	{
		return repository.save(u1);
	}
	
	public List<User> saveInfos(List<User> u2)
	{
		return repository.saveAll(u2);
	}

	public List<User> getInfo()
	{
		return repository.findAll();
	}
	
	public User getInfoById(long id)
	{
		return repository.findById(id).orElse(null);
	}
	
	
	
	public User updateInfo(User user)
	{	
		User existinguser=repository.findById(user.getId()).orElse(null);
		existinguser.setFirstname(user.getFirstname());
		existinguser.setLastname(user.getLastname());
		existinguser.setDob(user.getDob());
		existinguser.setGender(user.getGender());
		existinguser.setMobile(user.getMobile());
		existinguser.setEmail(user.getDob());
		return repository.save(existinguser);
	}
	
	
}
