package com.service;

import java.util.List;

import com.bean.Teacher_Assign;
import com.dao.Teacher_AssignDao;

public class Teacher_AssignService {
	public String storeTeacher(Teacher_Assign tcrasg) {
		Teacher_AssignDao ed = new Teacher_AssignDao();
		if(ed.storeTeacher_AssignDetails(tcrasg)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
		
	}
	
	public List<Teacher_Assign> getAllTeacher_Assign() {
		Teacher_AssignDao ed = new  Teacher_AssignDao();
		return ed.getAllTeacher_Assign();
	}
}
