package com.Q5_checkedException_at_Student_Portal;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter Your Name: ");
			String name = sc.next();
			
			System.out.print("Enter Your Country: ");
			String country = sc.next();
			
			UserRegistration registration = new UserRegistration();
			
			registration.registerUser(name, country);
			
			
		}catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Opps! Something gone wrong...");
		}finally {
			System.out.println("Thank You!");
		}
		

	}

}
