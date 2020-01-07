package com.johnabbott.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.test.model.Student;
import com.johnabbott.test.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/testmethod")
	public ModelAndView getName() {
		ModelAndView mv = new ModelAndView("test-jsp");
		mv.addObject("obj", "reza");

		return mv;
	}

	@RequestMapping(value = "/getstudents", method = RequestMethod.GET)
	public ModelAndView getStudentsList() {
		ModelAndView modelView = new ModelAndView("student-list");

		List<Student> students = service.getStudents();
		modelView.addObject("studList", students);
		
		return modelView;
	}
	
	//..../testconfigproject/students/student/Alex
	//Alex would be passed via path variable
	@RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
	public ModelAndView getStudent(@PathVariable("name") String studentName) {
		ModelAndView modelView = new ModelAndView("student");
		modelView.addObject("studentName", studentName);
		
		return modelView;
	}
	
	//.../students/studentbyId?id=8
	//id = 8 would be passed via requestparam
	@RequestMapping(value = "/studentbyId", method = RequestMethod.GET)
	public ModelAndView getStudent(@RequestParam("id") int studentId) {
		ModelAndView modelView = new ModelAndView("student");
		modelView.addObject("studentId", studentId);
		
		return modelView;
	}

}
