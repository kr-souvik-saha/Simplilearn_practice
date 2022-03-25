package com.dao;

import java.sql.* ;
import java.util.ArrayList;
import java.util.List;
import com.bean.Employee;
import com.resource.DbResource;

public class EmployeeDao {
	public int storeEmployee(Employee emp) {
		try {
			Connection con=DbResource.getDbConnection();
			
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO employee VALUES(?,?,?);");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2,emp.getName());
			pstmt.setFloat(3,emp.getSalary());
			int res=pstmt.executeUpdate();
			return res;
		}catch(Exception e) {
			System.out.println("Exception :"+e);
			return 0;
		}
	}
	
	public int deleteEmployee(int id) {
		try {
			Connection con=DbResource.getDbConnection();
			
			PreparedStatement pstmt = con.prepareStatement("Delete from employee where id=? ;");
			pstmt.setInt(1, id); 
			int res=pstmt.executeUpdate();
			return res;
		}catch(Exception e) {
			System.out.println("Exception :"+e);
			return 0;
		}
	}
	
	public int updateEmployee(Employee emp) {
		try {
			Connection con=DbResource.getDbConnection();
			
			PreparedStatement pstmt = con.prepareStatement("UPDATE employee SET salary = ? where id = ? ;");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2,emp.getName());
			pstmt.setFloat(3,emp.getSalary());
			int res=pstmt.executeUpdate();
			return res;
		}catch(Exception e) {
			System.out.println("Exception :"+e);
			return 0;
		}
	}
	
	public List<Employee> findAllEmployee() {
		
		List<Employee> listOfEmp = new ArrayList<>();
		
		try {
			Connection con=DbResource.getDbConnection();
			
			PreparedStatement pstmt = con.prepareStatement("select * from employee ;");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();				// converting each record into java bean object. 
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getFloat("salary"));
				listOfEmp.add(emp);
			}
			return listOfEmp;
		
		} catch (Exception e) {
			System.out.println(e);
		}
			return null;
	}

}
