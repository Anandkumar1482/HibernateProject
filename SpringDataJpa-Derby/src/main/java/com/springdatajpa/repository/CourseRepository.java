package com.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.model.Course;
import java.lang.String;
import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

	List<Course> findByName(String name);

}
