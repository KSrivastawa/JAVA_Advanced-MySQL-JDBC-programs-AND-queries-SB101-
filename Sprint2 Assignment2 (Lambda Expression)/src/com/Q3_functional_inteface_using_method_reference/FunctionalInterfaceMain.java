package com.Q3_functional_inteface_using_method_reference;

import java.util.Scanner;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		
		try {
			
			String stringNumber = sc.next();

			X x = Integer :: parseInt;
			
			System.out.println("Your result is: "+x.convetStringToNumber(stringNumber));
			
			
		}catch (NumberFormatException e) {
			
			System.out.println("This input cannot be conveted into Integer!");
		}
		catch (Exception e) {
			
			System.out.println("Opp! something gone wrong...");
		}finally {
			
			System.out.println("Thanks!");
		}
		
		
		
		
	}
	
}
