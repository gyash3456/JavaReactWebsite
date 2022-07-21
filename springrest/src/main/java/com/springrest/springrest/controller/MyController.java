package com.springrest.springrest.controller;
import com.springrest.springrest.entities.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 

import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "welcome to home";
	}
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){

		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId ) {
		return this.courseService.getCourse(Long.parseLong(courseId));
		
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course ) {
		return this.courseService.addCourse(course);
		
	}
	
	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		this.courseService.deleteCourse(Long.parseLong(courseId));
	}

}
