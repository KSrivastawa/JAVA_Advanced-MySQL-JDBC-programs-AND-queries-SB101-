package com.masai.use.cases.mainMethod;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.data.access.object.StudentException;
import com.masai.data.access.object.Student_DAO;
import com.masai.data.access.object.Student_DAO_Impl;

public class GetStudentByRollCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Roll:");
		int roll = sc.nextInt();
		
		
		Student_DAO dao = new Student_DAO_Impl();
		
		try {
			Student student = dao.getStudentByroll(roll);
			
			System.out.println("Student Roll: "+student.getRoll());
			System.out.println("Student Name: "+student.getName());
			System.out.println("Student Marks: "+student.getMarks());
	
			
		} catch (StudentException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		

	}

}
