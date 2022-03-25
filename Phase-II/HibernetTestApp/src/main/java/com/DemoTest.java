package com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("File Loaded");
		
		SessionFactory sf=con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran=session.getTransaction();
		
//		insert
		
//		Employee emp= new Employee();
//		emp.setId(71);
//		emp.setName("xxyyzz");
//		emp.setSalary(25000);
//		
//		tran.begin();
//		session.save(emp);
//		tran.commit();
//		
//		System.out.println("Record inserted successfully");
	
//		delete		
//		Employee emp=session.get(Employee.class, 2);
//		if(emp==null) {
//			System.out.println("Record not found");
//		}else {
//			tran.begin();
//				session.delete(emp);
//			tran.commit();
//			System.out.println("Record deleted successfully");
//		}
		
		
//		update
//		Employee emp=session.get(Employee.class, 1);
//		if(emp==null) {
//			System.out.println("Record not found");
//		}else {
//			tran.begin();
//			emp.setSalary(16200);
//				session.update(emp);
//			tran.commit();
//			System.out.println("Record updated successfully");
//		}
		
		
// 		Retrive only one record
//		Employee emp=session.get(Employee.class, 1);
//		if(emp==null) {
//			System.out.println("Record not found");
//		}else {
//			System.out.println("Name is :"+emp.getName()+"Salary is :"+emp.getSalary());
//		}
		
		// Retrive all or morethean one record
		Query qry=session.createQuery("Select emp from Employee emp");
		List<Employee> listOfEmp=qry.list();
		System.out.println("Numbers of recorde are :"+listOfEmp.size());
		Iterator<Employee> li =listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp =li.next();
			System.out.println(emp);
		}
	}

}
