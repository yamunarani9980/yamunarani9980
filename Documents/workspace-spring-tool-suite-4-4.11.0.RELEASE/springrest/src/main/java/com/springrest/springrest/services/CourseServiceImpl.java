package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;
@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(133,"spring","this is a intro"));
		list.add(new Course(1343,"boot","this is a program"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

}
