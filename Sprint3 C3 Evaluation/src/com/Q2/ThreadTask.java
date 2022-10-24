package com.Q2;


public class ThreadTask extends Thread {

	long product = 1;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			
			for(int i=1; i<=10; i++) {
				product = product*i;
			}
			
			this.notify();
		}
		
		
	}

	
	
}
