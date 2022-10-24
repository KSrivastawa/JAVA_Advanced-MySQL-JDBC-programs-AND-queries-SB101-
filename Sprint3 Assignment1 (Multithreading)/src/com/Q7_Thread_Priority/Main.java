package com.Q7_Thread_Priority;

public class Main {

	public static void main(String[] args) {

		ThreadPriority priority1 = new ThreadPriority();
		ThreadPriority priority2 = new ThreadPriority();
		
		priority1.setName("Dhoni");
		priority2.setName("Kohli");
		
		priority1.setPriority(8);
		priority2.setPriority(10);
		
		priority1.start();
		priority2.start();
		
		

	}

}
