package com.masai.data.access.object;

import java.util.List;

import com.masai.bean.Student;

public interface Student_DAO {

	public String registerStudent(String name, int marks, String email, String password);
	
	public String registerStudent2(Student student); //if you have more number of parameter always prefer this method
	
	public Student getStudentByroll(int roll) throws StudentException;
	
	public Student loginStudent(String username, String password) throws StudentException;
	
	public List<Student> getAllStudentDetails()throws StudentException;
	
	
}
