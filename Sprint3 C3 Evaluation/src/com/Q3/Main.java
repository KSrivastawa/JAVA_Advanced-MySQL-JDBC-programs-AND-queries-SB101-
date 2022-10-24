package com.Q3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		
		ThreadPoolTask[] tasks = {new ThreadPoolTask(5),
									new ThreadPoolTask(12),
									new ThreadPoolTask(3),
									new ThreadPoolTask(7),
									new ThreadPoolTask(4),
									new ThreadPoolTask(13)};
		
		ExecutorService  service = Executors.newFixedThreadPool(3);
		
		for(ThreadPoolTask t : tasks) {
			
			Future future = service.submit(t);
			
			try {
				System.out.println(future.get());
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (ExecutionException e) {
				
				e.printStackTrace();
			}
		}
		
		service.shutdown();

	}

}
