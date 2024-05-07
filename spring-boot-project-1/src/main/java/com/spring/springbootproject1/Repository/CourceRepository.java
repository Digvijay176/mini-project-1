package com.spring.springbootproject1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springbootproject1.entities.Course;

@Repository
public interface CourceRepository extends JpaRepository<Course, Integer> {

}
