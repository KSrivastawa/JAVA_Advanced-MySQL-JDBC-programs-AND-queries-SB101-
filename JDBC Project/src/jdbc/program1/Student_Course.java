package jdbc.program1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Student_Course {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		String url = "jdbc:mysql://localhost:3306/jdbc_project";
		
		try {
			Connection connection = DriverManager.getConnection(url, "root", "Prashant@20");
			
			if(connection != null)
				System.out.println("Connected...!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
