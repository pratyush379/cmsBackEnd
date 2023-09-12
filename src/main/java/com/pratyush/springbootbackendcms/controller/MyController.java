package com.pratyush.springbootbackendcms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratyush.springbootbackendcms.entity.Course;
import com.pratyush.springbootbackendcms.services.CourseService;

@CrossOrigin("*")
@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home(){
		return "this is home";
}
	
	//get the course
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	//get course by id
	@GetMapping("/courses/{courseId}")
	public Course getCourseById(@PathVariable String courseId){
		return courseService.getCourseById(Long.parseLong(courseId));
	}
	
	//add course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	//update course by id
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}
	
	
	//delete course by id
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourseById(@PathVariable String courseId){
		try {
			courseService.deleteCourseById(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	 
	
}
