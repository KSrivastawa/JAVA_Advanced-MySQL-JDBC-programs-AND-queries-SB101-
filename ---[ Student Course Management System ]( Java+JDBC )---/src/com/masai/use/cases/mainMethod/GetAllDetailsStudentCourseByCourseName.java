package com.masai.use.cases.mainMethod;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.StudentDataTransferObject;
import com.masai.data.access.object.CourseException;
import com.masai.data.access.object.StudentCourse_DAO;
import com.masai.data.access.object.StudentCourse_DAO_Impl;

public class GetAllDetailsStudentCourseByCourseName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name:");
		String cname = sc.next();
		
		StudentCourse_DAO dao = new StudentCourse_DAO_Impl();
		
		try {
			
			List<StudentDataTransferObject> list = dao.getAllDetailsByCourseName(cname);
			
			list.forEach(s -> {
				
				System.out.println("Student Roll:"+s.getRoll());
				System.out.println("Student Name:"+s.getName());
				System.out.println("Student Email:"+s.getEmail());
				System.out.println("Student Course Name:"+s.getCname());
				System.out.println("Student Course Fee:"+s.getFee());
				
				System.out.println("--------------------------------");
				
			});
			
			
		} catch (CourseException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}

}
