package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.bean.Employee;
import com.service.EmployeeService;

public class App {
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		EmployeeService es=new EmployeeService();
		int id;
		String name;
		float salary;
		String con="";
		int choice;
		String result;
		
		do {
			System.out.println("1:Add, 2: Delete, 3: Update, 4:Display All");
			System.out.println("Please enter your choice :");
			choice=Sc.nextInt();
			
			switch(choice) {
			case 1:System.out.println("Add");
					System.out.println("Enter teh id :");
					id=Sc.nextInt();
					System.out.println("Enter the Name :");
					name=Sc.next();
					System.out.println("Enter the salary :");
					salary=Sc.nextFloat();
					Employee emp=new Employee(id,name,salary);
					result=es.storeEmployee(emp);
					System.out.println(result);
					break;
					
			case 2:System.out.println("Delete");
					System.out.println("Enter the id :");
					id=Sc.nextInt();
					result=es.deleteEmployeeInfo(id);
					System.out.println(result);
					break;
					
			case 3:System.out.println("Update");
					System.out.println("Enter teh id :");
					id=Sc.nextInt();
					System.out.println("Enter the salary :");
					salary=Sc.nextFloat();
					Employee emp1=new Employee();
					emp1.setId(id);
					emp1.setSalary(salary);
					result=es.storeEmployee(emp1);
					System.out.println(result);
					break;
					
			case 4:System.out.println("View");
					List<Employee> listOfEmp = es.getAllEmployee();
					Iterator<Employee> li = listOfEmp.iterator();
					while(li.hasNext()) {
						Employee e = li.next();
						System.out.println(e);
					}
					break;
					
			default:System.out.println("Wrong choice");
				break;
				
			}
			System.out.println("Do you want to continue? y/n");
			con=Sc.next();
		}while(con.equals("y"));
		System.out.println("Thank you visit again!");
		 
	}

}
