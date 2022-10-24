package com.Q2DateOfBirth;

import java.time.DateTimeException;
import java.time.LocalDate;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Date of Birth (dd-mm-yyyy):");
		
		String dob = sc.next();
		
		try {
			
			LocalDate ld = LocalDate.now();
			
			LocalDate formattedDate = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			Integer age = Period.between(ld, formattedDate).getYears();
			
			if(age<0) {
				
				System.out.println(age);
			}
			
		
		}
		catch (InputMismatchException ae) {
			System.out.println("Date should not be in Future");
		}
		
		catch (DateTimeException ce) {
			System.out.println("Please enter the date in correct format");
		}

		catch (Exception e) {
			System.out.println("Please enter the date in correct format");
		}
		
		System.out.println("All Clear!");

	}

}
