package theadPool_3_Threads_6_Task_using_Callable_find_Even_Odd_number;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable[] t = {new MyCallable(23), new MyCallable(12), new MyCallable(30), new MyCallable(5), new MyCallable(10), new MyCallable(7898)};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		
		for(MyCallable task : t) {
			
			Future future = service.submit(task);
			
			System.out.println(future.get());
			
		}
		
		service.shutdown();

	}

}
