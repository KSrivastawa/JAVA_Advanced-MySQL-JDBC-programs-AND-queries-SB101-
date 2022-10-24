package com.Q2;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		
		// get any number in String format and return the number in	Integer format.
		
		Function<String, Integer> function = t ->  Integer.parseInt(t)*3;
		
		System.out.println("After Changed String into Integer: "+function.apply("10"));

		/*OutPut:
		 * After Changed String into Integer: 30
		 * 
		 */
		
	}

}
