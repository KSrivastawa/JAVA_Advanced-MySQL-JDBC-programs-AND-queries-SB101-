package com.Q1Exception;

import java.awt.FontFormatException;
import java.lang.invoke.StringConcatException;
import java.util.InputMismatchException;
import java.util.Scanner;
class Main {
	
public static void main(String args[]){
	 System.out.println("start of main..");
	 
	Scanner sc = new Scanner(System.in);
	String message = null;
	
	try {
		
	System.out.println("Enter num1");
	int num1 = sc.nextInt();
	
	System.out.println("Enter num2");
	int num2 = sc.nextInt();
	
		int num3 = num1 / num2;
	
		boolean flag = false;
		if(num3 > 10){
			message = "Welcome to Exception Handling ";
			flag = true;
		
		}
		System.out.println("Message is :"+ message.toUpperCase());

		if(flag == false) {
			System.out.println(message.length());
		}
		
	}catch(InputMismatchException im) {
		System.out.println("Please enter valid number");
		
	}catch(ArithmeticException ae) {
		System.out.println("num2 should not be 0");
		
	}catch(NullPointerException ne) {
		System.out.println("String value is null");
		
	}catch(Exception e) {
		
	}

	System.out.println("end of main");

	} 

}
