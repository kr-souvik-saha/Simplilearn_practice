package com.service;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
	public String storeTeacher(Student std) {
		StudentDao ed = new StudentDao();
		if(ed.storeStudentDetails(std)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
		
	}
	
	public List<Student> getAllStudent() {
		StudentDao ed = new  StudentDao();
		return ed.getAllStudent();
	}
}
