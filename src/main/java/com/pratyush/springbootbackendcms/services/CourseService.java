package com.pratyush.springbootbackendcms.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.pratyush.springbootbackendcms.entity.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourseById(long courseId);
	public Course addCourse(Course course) ;
	public Course updateCourse(Course course);
	public void deleteCourseById(long courseId);
}
