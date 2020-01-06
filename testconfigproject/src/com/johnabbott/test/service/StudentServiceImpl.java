package com.johnabbott.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.test.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("toto1", "popo1", 15));
		students.add(new Student("toto2", "popo2", 14));
		students.add(new Student("toto3", "popo3", 24));
		students.add(new Student("toto4", "popo4", 34));
		
		return students;
	}
}
