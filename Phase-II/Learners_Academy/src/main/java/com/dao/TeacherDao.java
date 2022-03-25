package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Teacher;
import com.resource.DbResource;

public class TeacherDao {
	public int storeTeacherDetails(Teacher tcr) {
		try {
			SessionFactory sf = DbResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(tcr);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	}
	public List<Teacher> getAllTeacher() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Query<Teacher> qry = session.createQuery("select t from Teacher t");
		List<Teacher> listOfTcr = qry.list();
		return listOfTcr;
	}
}
