package manyTOmany_byJDBC_studentCourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_Course2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Student_Course details--
		System.out.println("Enter the Roll:");
		int roll = sc.nextInt();
		
		System.out.println("Enter the Course Id:");
		int cid = sc.nextInt();
		
				
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		
		String url = "jdbc:mysql://localhost:3306/c4_evalution_q1";
		
		try(Connection connection = DriverManager.getConnection(url, "root", "Prashant@20")) {
			
			PreparedStatement student_courseStatement = connection.prepareStatement("insert into student_course values(?,?)");
			
			student_courseStatement.setInt(1, roll);
			student_courseStatement.setInt(2, cid);

			int scs = student_courseStatement.executeUpdate();
			
			if(scs >0) {
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

/*
 * Write a SQL to enroll Amit in Java and Spring.
● Write a SQL to enroll Venkat in Java and React.
 * Write a SQL to enroll Raj in Spring and Angular.
● Write a SQL to enroll Suresh in Java, Hibernate and React.
● Write a SQL to enroll Binay in React.

 */


