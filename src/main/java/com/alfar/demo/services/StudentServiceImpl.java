package com.alfar.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfar.demo.model.student;
import com.alfar.demo.repository.StudentRepository;


@Service
public class StudentServiceImpl implements Studentservice {

	@Autowired
	StudentRepository studentrepo;

	
	public student save(student stu) {
		
		
		return studentrepo.save(stu);
	}
		
		
	
	
}
