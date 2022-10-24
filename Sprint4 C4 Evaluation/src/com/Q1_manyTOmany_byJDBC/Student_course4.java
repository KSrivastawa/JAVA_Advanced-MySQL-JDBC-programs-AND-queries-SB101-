package com.Q1_manyTOmany_byJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_course4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Student_Course details--
		System.out.println("Enter the anyone Course Name(Java, Spring, Hibernate, React, Angular):");
		String cname = sc.next();
				
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		
		String url = "jdbc:mysql://localhost:3306/c4_evalution_q1";
		
		try(Connection connection = DriverManager.getConnection(url, "root", "Prashant@20")) {
			
			PreparedStatement student_courseStatement = connection.prepareStatement("Select s.roll, s.name, s.address, s.mobile from student s INNER JOIN course c INNER JOIN student_course sc ON s.roll = sc.roll AND c.cid = sc.cid AND c.cname = ? ");
			
			student_courseStatement.setString(1, cname);

			ResultSet set = student_courseStatement.executeQuery();
			
			boolean flag = false;
			
			while(set.next()) {
				flag = true;
				
				System.out.println("Student Roll: "+ set.getInt("roll"));
				System.out.println("Student Name: "+ set.getString("name"));
				System.out.println("Student Address: "+ set.getString("address"));
				System.out.println("Student Mobile No.: "+ set.getString("mobile"));
				
				System.out.println("-------------------------------------");
			}
			
			if(flag==false) {
				System.out.println("No record found");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}

}




