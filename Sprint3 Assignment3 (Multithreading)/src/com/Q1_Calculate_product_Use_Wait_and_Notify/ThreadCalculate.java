package com.Q1_Calculate_product_Use_Wait_and_Notify;

public class ThreadCalculate extends Thread {

	long product = 1; 
	
	public void run() {
			
		synchronized (this) {
			
			for(int i=1; i<=10; i++) {
				
				product = product * i;
				
			}
			
			this.notify();
		}
	
	
		
	}
	
}
