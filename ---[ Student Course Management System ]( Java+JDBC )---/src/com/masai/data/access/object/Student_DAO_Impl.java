package com.masai.data.access.object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Student;
import com.masai.utility.DataBaseUtility;

public class Student_DAO_Impl implements Student_DAO {

	@Override
	public String registerStudent(String name, int marks, String email, String password) {
		
		String message = "Not inserted..";
		
		try(Connection conn = DataBaseUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into student(name,marks,email,password) values(?,?,?,?)");
			
			ps.setString(1, name);
			ps.setInt(2, marks);
			ps.setString(3, email);
			ps.setString(4, password);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "Student Register Successfully...";
			}
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
		
	}

	
	@Override
	public String registerStudent2(Student student) {
		
		String message = "Not inserted..";
		
		try(Connection conn = DataBaseUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into student(name,marks,email,password) values(?,?,?,?)");
			
			ps.setString(1, student.getName());
			ps.setInt(2, student.getMarks());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getPassword());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "Student Registered Successfully...";
			}
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
	}


	@Override
	public Student getStudentByroll(int roll) throws StudentException {
		Student student = null;
		
		try(Connection conn = DataBaseUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("Select * from Student where roll = ?");
			
			ps.setInt(1, roll);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e = rs.getString("email");
				String p = rs.getString("password");
				
				
				student = new Student(r, n, m, e, p);
				
			}
			else {
				
				throw new StudentException("Student does not exist with roll "+roll);
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			throw new StudentException(e.getMessage());
		}
		
		
		return student;
	}

	

	@Override
	public Student loginStudent(String username, String password) throws StudentException {
		
		Student student = null;
		
		try(Connection conn = DataBaseUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student where email = ? AND password = ?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e = rs.getString("email");
				String p = rs.getString("password");
				
				student = new Student(r, n, m, e, p);
				
			}
			else {
				throw new StudentException("Invalid Username and Password");
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		
		
		
		return student;
	}


	
	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		
		List<Student> list = new ArrayList<>();
		
		try(Connection conn = DataBaseUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e = rs.getString("email");
				String p = rs.getString("password");
				
				Student student = new Student(r, n, m, e, p);
				
				list.add(student);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			throw new StudentException(e.getMessage());
		
		}	
		
		if(list.size() ==0)
			throw new StudentException("No Student Found..");
		
		
		return list;
	
	}

	
	
	
}
