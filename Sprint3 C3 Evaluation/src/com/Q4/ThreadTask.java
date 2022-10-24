package com.Q4;

public class ThreadTask extends Thread {

	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		Thread.currentThread().getPriority();
		
		// System.out.println(name);
		
		if(name.equalsIgnoreCase("Kohli")) {
			String bag = "";
			for(int i=1; i<=10; i++) {
				bag = bag+i+" ";
			}
			System.out.println("Kohli should print from 1 to 10 number: "+bag);
		}
		else if(name.equalsIgnoreCase("Dhoni")) {
			int sum = 0;
			
			for(int i=1; i<=20; i++) {
				sum = sum+i;
			}
			System.out.println("Dhoni should print Addition of first 20 number: "+sum);
		}
		else if(name.equalsIgnoreCase("Rohit")) {
			long product = 1;
			
			for(int i=1; i<=10; i++) {
				product = product*i;
			}
			System.out.println("Rohit should print the product of first 10 number: "+product);
		}
		
	}
	
}
