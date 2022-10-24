package com.Q1_Calculate_product_Use_Wait_and_Notify;

public class Main {

	public static void main(String[] args) {
		
		ThreadCalculate calculate = new ThreadCalculate();
		
		calculate.start();

		synchronized (calculate) {
			
			try {
				calculate.wait();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Calculated Product of 1 to 10 : "+calculate.product);
			
		}
		
		
	
	}

}
