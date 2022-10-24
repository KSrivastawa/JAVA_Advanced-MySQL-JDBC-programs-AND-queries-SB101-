package com.Q6_Threadpool_calculate_Odd_Even;

import java.util.concurrent.Callable;

public class Task implements Callable {

	int num;

	public Task(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		
		System.out.print(Thread.currentThread().getName()+" having "+num+" is a: ");

		Thread.sleep(2000);
		
		if(num%2==0) {
			return "Even Number";
		}
		
		return "Odd Number";
	}
	

	
	
}
