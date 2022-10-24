package com.Q1_manyTOmany_byJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_Course {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Student details--
		System.out.println("Enter the Roll:");
		int roll = sc.nextInt();
		
		System.out.println("Enter the Name:");
		String name = sc.next();
		
		System.out.println("Enter the Address:");
		String address = sc.next();
		
		System.out.println("Enter the Mobile:");
		String mobile = sc.next();
		
		
				// Course details--
				System.out.println("Enter the Course Id:");
				int cid = sc.nextInt();
				
				System.out.println("Enter the Course Name:");
				String cname = sc.next();
				
				System.out.println("Enter the Course Fee:");
				int fee = sc.nextInt();
				
				System.out.println("Enter the Course Duration(00-days):");
				String duration = sc.next();
		
				
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		
		String url = "jdbc:mysql://localhost:3306/c4_evalution_q1";
		
		try(Connection connection = DriverManager.getConnection(url, "root", "Prashant@20")) {
			
			PreparedStatement studentStatement = connection.prepareStatement("insert into student values(?,?,?,?)");
			
			studentStatement.setInt(1, roll);
			studentStatement.setString(2, name);
			studentStatement.setString(3, address);
			studentStatement.setString(4, mobile);
			
			PreparedStatement courseStatement = connection.prepareStatement("insert into course values(?,?,?,?)");
			
			courseStatement.setInt(1, cid);
			courseStatement.setString(2, cname);
			courseStatement.setInt(3, fee);
			courseStatement.setString(4, duration);
			
			int ss = studentStatement.executeUpdate();
			int cs = courseStatement.executeUpdate();
			
			if(ss >0 && cs >0) {
				System.out.println("Tables Updated successfully...!");
			}
			else {
				System.out.println("Not updated Something Wrong...");
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}

}




