package com.springdatajpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.model.Course;
import com.springdatajpa.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService service;

	@RequestMapping(method = RequestMethod.POST, value = "/course", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCourse(@RequestBody Course course) {
		service.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/course")
	public List<Course> getAllCourse() {
		return service.getAllCourse();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
	public Optional<Course> getAllCourseBy(@PathVariable int id) {
		return service.getCourseById(id);

	}

	/*
	 * @RequestMapping(method = RequestMethod.PUT, value = "/course/{id}") public
	 * Course updateCourse(@RequestBody Course course) { return
	 * service.updateCourse(course); }
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "course/{id}")
	public void deleteCourse(@PathVariable int id) {
		service.deleCourse(id);
	}

}
