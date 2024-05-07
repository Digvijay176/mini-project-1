package com.spring.springbootproject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootproject1.entities.Course;
import com.spring.springbootproject1.service.CourseService;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	// http://localhost:9595/course
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course){
		return service.addCourse( course);
	}
	
	// http://localhost:9595/course
	@GetMapping("/course")
	public List<Course> getAllCourse() {
		return service.getAllCource();
	}
	
	// http://localhost:9595/course/id
	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable("id")int id) {
		service.deleteCourse(id);
	}
	
	// http://localhost:9595/course/id
	@PatchMapping("/course/{id}")
	public  Course updateCourse(@RequestBody Course c,@PathVariable("id") int id ) {
		return service.updateCourse(c, id);
	}
}
