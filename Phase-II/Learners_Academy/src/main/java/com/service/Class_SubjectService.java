package com.service;

import java.util.List;

import com.bean.Class_Subject;
import com.dao.Class_SubjectDao;

public class Class_SubjectService {
	public String storeClass_Subject(Class_Subject clsub) {
		Class_SubjectDao ed = new Class_SubjectDao();
		if(ed.storeClass_SubjectDetails(clsub)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
		
	}
	
	public List<Class_Subject> getAllClass_Subject() {
		Class_SubjectDao ed = new  Class_SubjectDao();
		return ed.getAllClass_Subject();
	}
}
