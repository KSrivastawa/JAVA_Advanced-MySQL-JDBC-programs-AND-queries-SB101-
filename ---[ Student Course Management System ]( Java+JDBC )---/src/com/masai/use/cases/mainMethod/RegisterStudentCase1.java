package com.masai.use.cases.mainMethod;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.data.access.object.Student_DAO;
import com.masai.data.access.object.Student_DAO_Impl;

public class RegisterStudentCase1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student Name:");
		String name = sc.next();
		
		System.out.println("Enter the Student Marks:");
		int marks = sc.nextInt();
		
		System.out.println("Enter the Student Email:");
		String email = sc.next();
		
		System.out.println("Enter the Student Password:");
		String password = sc.next();
		
		
		Student_DAO dao = new Student_DAO_Impl();
		
		// String result = dao.registerStudent(name, marks, email, password);
		
		Student student = new Student();
		
		student.setName(name);
		student.setMarks(marks);
		student.setEmail(email);
		student.setPassword(password);
		
		String result = dao.registerStudent2(student);
		
		System.out.println(result);
		
		
		
		
		

	}

}
