package com.pratyush.springbootbackendcms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratyush.springbootbackendcms.entity.Course;

public interface CourseDao extends JpaRepository<Course , Long>{

}
