package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.CourseServiceImpl;


@RestController
public class mycontroller {
	@Autowired
	private CourseService couserservice;
	
	@GetMapping("/courses")
	
	public List<Course> getCourses()
	{
		return this.couserservice.getCourses();
	}

}
