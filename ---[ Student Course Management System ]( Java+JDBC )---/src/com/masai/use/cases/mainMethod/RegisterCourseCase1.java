package com.masai.use.cases.mainMethod;

import java.util.Scanner;

import com.masai.bean.Course;
import com.masai.data.access.object.Course_DAO;
import com.masai.data.access.object.Course_DAO_Impl;


public class RegisterCourseCase1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Course Name:");
		String cname = sc.next();
		
		System.out.println("Enter Course Fee:");
		int fee = sc.nextInt();
		
		
		Course course = new Course();
		
		course.setCname(cname);
		course.setFee(fee);
		
		Course_DAO dao = new Course_DAO_Impl();
		
		String result = dao.registerCourse(cname, fee);
		
		System.out.println(result);
		
		

	}

}
