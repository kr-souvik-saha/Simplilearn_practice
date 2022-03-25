package com.service;

import java.util.Iterator;
import java.util.List;
import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary must be more then 12000";
		}else {
			EmployeeDao ed=new EmployeeDao();
			if(ed.storeEmployee(emp) > 0) {
				return "Record inserted";
			}else {
				return "Record didn't inserted";
			}
		}
	}
	
	public String deleteEmployeeInfo(int id) {
		EmployeeDao ed=new EmployeeDao();
		if(ed.deleteEmployee(id)>0) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String updateEmployee(Employee emp) {
		EmployeeDao ed=new EmployeeDao();
		if(ed.updateEmployee(emp)>0) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	
	public List<Employee> getAllEmployee() {
		EmployeeDao ed = new EmployeeDao();
		List<Employee> listOfEmp = ed.findAllEmployee();
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			emp.setSalary(emp.getSalary()+1000);
		}
		return listOfEmp;
	}

}