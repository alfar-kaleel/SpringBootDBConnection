package com.alfar.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alfar.demo.model.student;
import com.alfar.demo.services.StudentServiceImpl;
import com.alfar.demo.services.Studentservice;

@RestController
public class ApplicationController {
	
	@Autowired
	Studentservice studentservice;
	
	@RequestMapping("/services")
	public String welcome() {
		
		
		return "welcome";
	}

	@RequestMapping(value= "/student" , method = RequestMethod.POST)
	public student save(@RequestBody student stu) {
		
          return studentservice.save(stu);
		
	}
}
