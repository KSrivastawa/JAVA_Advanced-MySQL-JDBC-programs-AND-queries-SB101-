package com.Q6_Threadpool_calculate_Odd_Even;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Task[] t = {new Task(23), new Task(12), new Task(30), new Task(5), new Task(10), new Task(7898)};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(Task task : t) {
			
			Future future = service.submit(task);
			
			System.out.println(future.get());
			
		}
		
		service.shutdown();

	}

}
