package com.Q5_Sleep_and_Join;

public class Join extends Thread {

	@Override
	public void run() {

		String s = Thread.currentThread().getName();
		for(int i=0; i<3; i++) {
			
			System.out.println(s);
		}
	}
	
	
}
