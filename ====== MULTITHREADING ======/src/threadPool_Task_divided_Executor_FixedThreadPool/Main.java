package threadPool_Task_divided_Executor_FixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		Runnable r1 = new Task("first");
		Runnable r2 = new Task("second");
		Runnable r3 = new Task("three");
		Runnable r4 = new Task("four");
		Runnable r5 = new Task("five");
		
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		
		pool.shutdown();

	}

}
