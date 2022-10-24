package com.Q4;

public class Main {

	public static void main(String[] args) {

		ThreadTask task1 = new ThreadTask();
		ThreadTask task2 = new ThreadTask();
		ThreadTask task3 = new ThreadTask();
		
		task1.setName("Kohli");
		task2.setName("Dhoni");
		task3.setName("Rohit");
		
		task2.setPriority(10);
		task1.setPriority(1);
		task3.setPriority(3);
		
		
		task2.start();
		task3.start();
		
		try {
			task2.join();
			task3.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		task1.start();
		
		

	}

}
