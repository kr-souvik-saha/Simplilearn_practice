package com.service;

import java.util.List;

import com.bean.Teacher;
import com.dao.TeacherDao;

public class TeacherService {
	public String storeTeacher(Teacher tcr) {
		TeacherDao ed = new TeacherDao();
		if(ed.storeTeacherDetails(tcr)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
		
	}
	
	public List<Teacher> getAllTeacher() {
		TeacherDao ed = new  TeacherDao();
		return ed.getAllTeacher();
	}
}
