package com.Q7_Thread_Priority;

public class ThreadPriority extends Thread {

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		for(int i=0; i<5; i++) {
			
			System.out.println(priority+" - " +name);
			
		}
		
	}
	
	
}
