package com.Q6_Constructor_Throws_Exception;

public class Demo {

	public static void main(String[] args) {
		
		try {
			
			Parent parent = new Child();
			parent.fun1();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		System.out.println("End of the main!");
	}

}
