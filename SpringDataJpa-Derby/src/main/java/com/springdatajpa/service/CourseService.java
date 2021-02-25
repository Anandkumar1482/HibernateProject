package com.springdatajpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springdatajpa.model.Course;
import com.springdatajpa.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repo;

	public void addCourse(Course course) {
		repo.save(course);
	}

	public List<Course> getAllCourse() {

		List<Course> course = new ArrayList<Course>();
		repo.findAll().forEach(course::add);
		return course;
	}

	public Optional<Course> getCourseById(int id) {

		System.out.println(repo.findByName("java"));
		return repo.findById(id);
	}

	public void deleCourse(int id) {

		repo.deleteById(id);

	}

}
