package com.java4jj.learnspringboot.courses.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java4jj.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	// http://localhost:8080/courses
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1L, "Learn Spring Boot v2.0", "java4jj"),
				new Course(2L, "Learn Full Stack", "java4jj")
				);
	}
	
	@GetMapping("/courses/1")
	public Course getCourseDetails() {
		return new Course(1L, "Learn Spring Boot", "java4jj");
	}
	
	@GetMapping("/fib/{idx}")
	public String getFibResult(@PathVariable String idx) {
		String input =  new String("Requesting Fibonacci number " + idx);
		try {
			Integer n = Integer.parseInt(idx);
			List<Integer> fibs = new ArrayList<>();
			fibs.add(0); // 0th
			fibs.add(1);
			for (int i=2; i<=n; ++i) {
				int newfib = fibs.get(i-1) +fibs.get(i-2);
				fibs.add(newfib);
			}
			return "Fibonacci number " + idx + " is: " + fibs.get(n);
		} catch (Exception exp) {
			return "Sorry! Failed to Compute Fibonacci number " + idx;
		}
		
	}
}
