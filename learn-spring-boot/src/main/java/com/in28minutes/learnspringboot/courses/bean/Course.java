package com.in28minutes.learnspringboot.courses.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.in28minutes.learnspringboot.repository.CourseRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Course1")
public class Course {
	
	
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String author;
	public Course() {
		
	}
	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	@GetMapping("/courses")
	public List<Course> findAll(){
		return courseRepo.findAll();
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}





}
