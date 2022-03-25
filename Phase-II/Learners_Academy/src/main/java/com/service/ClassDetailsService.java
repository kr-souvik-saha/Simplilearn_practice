package com.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.Teacher_Assign;
import com.resource.DbResource;

public class ClassDetailsService {
	public List<Teacher_Assign> getAllTeacher_Assign() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Query<Teacher_Assign> qry = session.createQuery("select t from Teacher_Assign t");
		List<Teacher_Assign> listOfTcr = qry.list();
		return listOfTcr;
	}
}
