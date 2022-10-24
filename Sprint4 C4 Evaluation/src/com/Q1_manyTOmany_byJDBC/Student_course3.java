package com.Q1_manyTOmany_byJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_course3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Student_Course details--
		System.out.println("Enter the Roll:");
		int roll = sc.nextInt();
				
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		
		String url = "jdbc:mysql://localhost:3306/c4_evalution_q1";
		
		try(Connection connection = DriverManager.getConnection(url, "root", "Prashant@20")) {
			
			PreparedStatement student_courseStatement = connection.prepareStatement("Select c.cname, c.fee, c.duration  from student s INNER JOIN course c INNER JOIN student_course sc ON s.roll = sc.roll AND c.cid = sc.cid AND s.roll = ? ");
			
			student_courseStatement.setInt(1, roll);

			ResultSet set = student_courseStatement.executeQuery();
			
			boolean flag = false;
			
			while(set.next()) {
				flag = true;
				
				System.out.println("Course Name: "+ set.getString("cname"));
				System.out.println("Course Fee: "+ set.getString("fee"));
				System.out.println("Course Duration: "+ set.getString("duration"));
				
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




