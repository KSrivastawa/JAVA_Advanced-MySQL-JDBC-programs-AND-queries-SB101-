package com.Q3_Display_Odd_Even_Numbers_by_Join;

public class EvenNumbers extends Thread {

	int number = 20;
	
	public void run() {
		
		System.out.println("Even Numbers:");
		
		for(int i=1; i<= number; i++ ) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("--------");
		
	}
	
}
