package com.Q3_Display_Odd_Even_Numbers_by_Join;

public class OddNumbers extends Thread {

	EvenNumbers evenNumbers;
	
	public OddNumbers(EvenNumbers numbers) {
		
		this.evenNumbers = numbers;
		
	}
	
	
	public void run() {
		
		try {
			evenNumbers.join();
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Odd Numbers:");
		
		for(int i=1; i<=evenNumbers.number; i++) {
			
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		System.out.println("--------");
		
	}
	
}
