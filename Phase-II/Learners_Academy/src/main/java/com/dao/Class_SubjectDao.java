package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Class_Subject;
import com.resource.DbResource;

public class Class_SubjectDao {
	public int storeClass_SubjectDetails(Class_Subject clsub) {
		try {
			SessionFactory sf = DbResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(clsub);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	}
	public List<Class_Subject> getAllClass_Subject() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Query<Class_Subject> qry = session.createQuery("select cs from Class_Subject cs");
		List<Class_Subject> listOfClsub = qry.list();
		return listOfClsub;
	}
}