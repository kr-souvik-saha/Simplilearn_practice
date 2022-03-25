package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Class;
import com.resource.DbResource;

public class ClassDao {
	public int storeClassesDetails(Class cls) {
		try {
			SessionFactory sf = DbResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(cls);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	}
	public List<Class> getAllClasses() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Query<Class> qry = session.createQuery("select c from Class c");
		List<Class> listOfCls = qry.list();
		return listOfCls;
	}
}
