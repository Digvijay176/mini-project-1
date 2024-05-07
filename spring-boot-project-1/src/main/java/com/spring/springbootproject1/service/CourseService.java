package com.spring.springbootproject1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springbootproject1.Repository.CourceRepository;
import com.spring.springbootproject1.entities.Course;

@Service
public class CourseService {
	
	@Autowired
	private CourceRepository repo;
	
	//	add course
	public Course addCourse(Course course) {
		return repo.save(course);
	}
	
	//	delete course
	public void deleteCourse(int id) {
		Optional<Course> c = repo.findById(id);
		if(c.isPresent()) repo.deleteById(id);
	}
	
	//	update course
	public Course updateCourse(Course c , int id) {
		if(c.getId()==id) {
			Optional<Course> oldc = repo.findById(id);
			Course cr = oldc.get();
			if(oldc.isEmpty())return null;
			else {
				cr.setTitle(c.getTitle());
				cr.setDescription(c.getDescription());
			}
			return repo.save(cr);
		}
		return null;
	}
	
	//	find all 
	public List<Course> getAllCource(){
		return repo.findAll();
	}
	
}
