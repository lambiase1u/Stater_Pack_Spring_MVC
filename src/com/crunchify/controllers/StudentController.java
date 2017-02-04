package com.crunchify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crunchify.models.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("studentForm", "command", new Student());
	}


	@RequestMapping(value = "/student/add", method = RequestMethod.POST)
	public ModelAndView groupe(@ModelAttribute("student") Student student) {
		
		return new ModelAndView("studentDisplay", "student", student);

	}
	
	/*
	@RequestMapping(value = "/student/add", method = RequestMethod.POST)
	public ModelAndView groupe(@ModelAttribute("student") Student student) {
		return new ModelAndView("studentDisplay", "student", student);

	}*/
	
	@RequestMapping(value="/student/{id}", method = RequestMethod.GET)
	public String findStudentById(ModelMap model, @PathVariable("id") int id ){
			
		  Student s = new Student();
		  s.setId(id);
		  s.setAge(12);
		  s.setName("Jospeh");
		  model.addAttribute("student", s);

		return "studentById";
	}


}
