package com.pratyush.springbootbackendcms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratyush.springbootbackendcms.dao.CourseDao;
import com.pratyush.springbootbackendcms.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
 
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourseById(long courseId) {
		return courseDao.findById(courseId).get()	;
		}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourseById(long courseId) {
		Course c = courseDao.getOne(courseId);
		courseDao.delete(c);
		
	}

/*	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"java","java"));
		list.add(new Course(146,"python","good snake"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourseById(long courseId) {
		Course c = null;
		for(Course course : list)
		{
			if(course.getId() == courseId)
				{
				c = course;
				
			    break;
				}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e ->{
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public void deleteCourseById(long courseId) {
		list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
		
	}
	
*/	

}
