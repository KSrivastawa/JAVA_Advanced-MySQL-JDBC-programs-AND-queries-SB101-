package theadPool_3_Threads_6_Task_using_Callable_find_sumOfNumber;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		MyCallable[] c = {new MyCallable(12),new MyCallable(7),new MyCallable(20),
				new MyCallable(31),new MyCallable(15),new MyCallable(5),};
		
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyCallable mc : c) {
			
		Future<Integer> future	= service.submit(mc);
		
		System.out.println(future.get());
			
		}
		
		service.shutdown();

	}

}
