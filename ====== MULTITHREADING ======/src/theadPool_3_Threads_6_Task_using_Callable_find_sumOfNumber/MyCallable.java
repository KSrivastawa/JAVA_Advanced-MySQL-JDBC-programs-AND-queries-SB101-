package theadPool_3_Threads_6_Task_using_Callable_find_sumOfNumber;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	int num;
	
	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+ " is responsible to find sum of 1 to "+num+" number:");
		
		int sum =0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		Thread.sleep(2000);
		
		return sum;
	}
	
}
