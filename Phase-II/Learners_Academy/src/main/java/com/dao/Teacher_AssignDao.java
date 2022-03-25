package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Teacher_Assign;
import com.resource.DbResource;

public class Teacher_AssignDao {
	public int storeTeacher_AssignDetails(Teacher_Assign tcrasg) {
		try {
			SessionFactory sf = DbResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(tcrasg);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	}
	public List<Teacher_Assign> getAllTeacher_Assign() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Query<Teacher_Assign> qry = session.createQuery("select t from Teacher_Assign t");
		List<Teacher_Assign> listOfTcr = qry.list();
		return listOfTcr;
	}
}
