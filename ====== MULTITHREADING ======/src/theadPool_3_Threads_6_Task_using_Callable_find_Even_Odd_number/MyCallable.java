package theadPool_3_Threads_6_Task_using_Callable_find_Even_Odd_number;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

	int num;

	public MyCallable(int num) {
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
