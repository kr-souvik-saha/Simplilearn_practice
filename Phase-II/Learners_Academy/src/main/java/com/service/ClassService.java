package com.service;

import java.util.List;

import com.bean.Class;
import com.dao.ClassDao;

public class ClassService {
	public String storeClasses(Class clsub) {
		ClassDao ed = new ClassDao();
		if(ed.storeClassesDetails(clsub)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
		
	}
	
	public List<Class> getAllClasses() {
		ClassDao ed = new  ClassDao();
		return ed.getAllClasses();
	}
}
