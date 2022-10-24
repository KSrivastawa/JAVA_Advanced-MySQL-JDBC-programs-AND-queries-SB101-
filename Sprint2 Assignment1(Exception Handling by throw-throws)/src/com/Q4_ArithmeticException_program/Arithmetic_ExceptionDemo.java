package com.Q4_ArithmeticException_program;

import java.util.Scanner;

public class Arithmetic_ExceptionDemo {

	public static int arithmeticProgram(int a, int b) {
		
		int x = a/b;
		
		return x;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 2 numbers: ");
		
		try {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = arithmeticProgram(a, b);
			
			System.out.println("The quotient of "+a+"/"+b+" = "+result);
			
		}catch (ArithmeticException e) {
			
			System.out.println("DivideByZeroException caught");
			
		}catch (Exception e) {
			
			System.out.println("Opps! Something goes wrong...");
			
		}finally {
			
			System.out.println("Inside finally block");
		}
		
		
	}

}
