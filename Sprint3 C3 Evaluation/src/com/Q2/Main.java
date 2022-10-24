package com.Q2;

public class Main {

	public static void main(String[] args) {
		
		ThreadTask task = new ThreadTask();
		
		task.start();
		
		synchronized (task) {
			
			try {
				task.wait();
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

			System.out.println("calculated product value of 1 to 10 number: "+ task.product);
			
		}
		
		
	}

}
