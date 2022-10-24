package com.Q3;

import java.util.concurrent.Callable;

public class ThreadPoolTask implements Callable<Object> {

	int num;
	
	public ThreadPoolTask(int num) {
		super();
		this.num = num;
	}



	@Override
	public Object call() throws Exception {
		
		System.out.print(Thread.currentThread().getName()+ " having the product value of 1 to "+num+" is : ");
		
		Thread.sleep(1000);   // this sleep added for looks good only - by me. Not asked in question. 
		
		long product =  1;
		for(int i=1; i<=num; i++) {
			product = product*i;
		}

		return product;
	}

	
	
}
