import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Student_Course {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter the Roll: ");
		int roll = sc.nextInt();
		
		System.out.println("Enter the Name:");
		String name = sc.next();
		
		System.out.println("Enter the Address:");
		String address = sc.next();
		
		System.out.println("Enter the Mobile no:");
		String mobile = sc.next();
		
		System.out.println("Enter the Date of Birth(yyyy-mm-dd)");
		String dob = sc.next();
		*/
		
		/*
		System.out.println("Enter the Course Id: ");
		int cid = sc.nextInt();
		
		System.out.println("Enter the Course Name:");
		String cname = sc.next();
		
		System.out.println("Enter the Fee:");
		String fee = sc.next();
		
		System.out.println("Enter the Duration(00-days):");
		String duration = sc.next();
		*/
		
		/*
		System.out.println("Enter the Roll: ");
		int roll = sc.nextInt();
		
		System.out.println("Enter the Course Id:");
		int cid = sc.nextInt();
		*/
		
		/*
		System.out.println("Enter the Title Name: ");
		String addName = sc.next();
		*/
		
		System.out.println("Enter the Roll: ");
		int roll = sc.nextInt();
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			
			String url = "jdbc:mysql://localhost:3306/s4a4";
			
			try(Connection connection = DriverManager.getConnection(url, "root", "Prashant@20")) {
				/*
				PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?,?)");
				
				ps.setInt(1, roll);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.setString(4, mobile);
				ps.setString(5, dob);
				
				*/
				
				/*
				PreparedStatement ps = connection.prepareStatement("insert into course values(?,?,?,?)");
				
				ps.setInt(1, cid);
				ps.setString(2, cname);
				ps.setString(3, fee);
				ps.setString(4, duration);
				*/
				
				/*
				PreparedStatement ps = connection.prepareStatement("insert into student_course values(?,?)");
				
				ps.setInt(1, roll);
				ps.setInt(2, cid);
				*/
				
				/*
				PreparedStatement ps = connection.prepareStatement("update student set Name = ? where Name = 'Ketan'");
				
				ps.setString(1, addName);

			    int x = ps.executeUpdate();
				
				if(x > 0)
					System.out.println("Statement updated successfully");
				
				else 
					System.out.println("Opps Something wrong...!");
				*/
				
				
				/*
				PreparedStatement ps = connection.prepareStatement("select s.Roll, s.Name, s.Address, s.Mobile, s.Date_of_birth, c.cName, c.Fee, c.Duration from student s INNER JOIN course c INNER JOIN student_course sc ON s.Roll = sc.Roll AND c.cId = sc.cId");
				
				ResultSet rs = ps.executeQuery();
				
				int c =1;
				while(rs.next()) {
					
					System.out.println("Student and Course details for "+ c++);
					System.out.println("- - - - - - - - - - - - - - - - - -");
					
					System.out.println("Student Roll No: " + rs.getInt("Roll"));
					System.out.println("Student Name: " + rs.getString("Name"));
					System.out.println("Student Address: " + rs.getString("Address"));
					System.out.println("Student Mobile: " + rs.getString("Mobile"));
					System.out.println("Student Date Of Birth: " + rs.getDate("Date_of_birth"));
					System.out.println("Course Name: " + rs.getString("cName"));
					System.out.println("Course Fee: " + rs.getInt("Fee"));
					System.out.println("Course Duration: " + rs.getString("Duration"));
					
					System.out.println("====================================");
					
				}
				
				*/
				
				PreparedStatement ps = connection.prepareStatement("select s.Roll, s.Name, s.Address, s.Mobile, s.Date_of_birth, c.cName, c.Fee, c.Duration from student s INNER JOIN course c INNER JOIN student_course sc ON s.Roll = sc.Roll AND c.cId = sc.cId AND s.Roll = ?");
				ps.setInt(1, roll);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					
					System.out.println("Student Roll No: " + rs.getInt("Roll"));
					System.out.println("Student Name: " + rs.getString("Name"));
					System.out.println("Student Address: " + rs.getString("Address"));
					System.out.println("Student Mobile: " + rs.getString("Mobile"));
					System.out.println("Student Date Of Birth: " + rs.getDate("Date_of_birth"));
					System.out.println("Course Name: " + rs.getString("cName"));
					System.out.println("Course Fee: " + rs.getInt("Fee"));
					System.out.println("Course Duration: " + rs.getString("Duration"));
					
					System.out.println("====================================");
					
				}
				else
					System.out.println("Data not Available...!");
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			

	}

}














