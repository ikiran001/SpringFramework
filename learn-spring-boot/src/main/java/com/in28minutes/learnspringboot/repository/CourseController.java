package com.in28minutes.learnspringboot.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController { //we want to expose a simple Rest API
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		List<Course> list=new ArrayList<>();
		list.add(new Course(1,"kiran Jadhav","in28Minutes"));
		list.add(new Course(1,"kiran ","in28Minutes2"));
		list.add(new Course(1," Jadhav","in28Minutes"));
		
		return list;
	//	return Arrays.asList(new Course(1,"Learn microservicess", "in28Minutes"),(new Course(2,"Kiran Course","Kiran Jadhav")));
	}
	

	@GetMapping("/courses/1")
	public Course getCourse(){
		return new Course(1,"Learn microservicess", "in28Minutes");
	}
}
