package abc;

import java.sql.*;
import java.util.Scanner;
public class CRUD {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loeded sucessfully");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/My_database","root","root");
			System.out.println("Database connected");
			
//			Statement stmt =conn.createStatement();
//			int res = stmt.executeUpdate("INSERT INTO employee VALUE(5,'raju',13500);");
//			if(res>0) {
//				System.out.println("Record inserted successfully");
//			}
			
			//now we will do the same using prepareStatement
			
			Scanner sc=new Scanner(System.in);
			PreparedStatement pstmt = conn.prepareStatement("Insert into employee values(?,?,?);");
			System.out.println("Enter the id :");
			int id=sc.nextInt();
			pstmt.setInt(1,id);
			System.out.println("Enter name :");
			String name=sc.next();
			pstmt.setString(2, name);
			System.out.println("Enter salary :");
			float salary=sc.nextFloat();
			pstmt.setFloat(3, salary);
			int res=pstmt.executeUpdate();
			if(res>0) {
				System.out.println("Records inserted successfully");
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
