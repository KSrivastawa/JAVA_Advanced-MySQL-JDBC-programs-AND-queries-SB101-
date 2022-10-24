package theadPool_3_Threads_6_Task_byString_Name;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		Task[] t = {new Task("Ketan"),new Task("Prashant"),
				new Task("Rohit"),new Task("Kesri"),new Task("Rahul"),new Task("Ravi"),};
		
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(Task n : t) {
			service.submit(n);
		}
		
		service.shutdown();

	}

}
