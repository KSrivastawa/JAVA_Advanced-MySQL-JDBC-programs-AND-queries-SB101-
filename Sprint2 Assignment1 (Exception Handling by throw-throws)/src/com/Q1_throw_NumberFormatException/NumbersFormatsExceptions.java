package com.Q1_throw_NumberFormatException;

import java.util.*;

public class NumbersFormatsExceptions {
	
	static int findException(String num)  {
				
		int n = Integer.parseInt(num);
		
		int x = 0;
		
		if(n > 0 || n < 0) {
			x += n*n;
		}
	
		return x;
	}

	public static void main(String[] args)  {
		
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter an integer: ");
	
			String s = sc.next();

			
		try {
			int x = findException(s);
			
			System.out.println("The square value is " + x);
		
		}catch (NumberFormatException e) {
			
			System.out.println("Entered input is not a valid format for an integer.");
		}

		System.out.println("The work has been done successfully");
		
	}

}
