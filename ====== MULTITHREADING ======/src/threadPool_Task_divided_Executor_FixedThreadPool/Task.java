package threadPool_Task_divided_Executor_FixedThreadPool;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task  implements Runnable{

	String s;
	
	public Task(String s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		
		try {
			
			for(int i=0; i<=5; i++) {
				
				if(i==0) {
					Date date = new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for task name -"+s+" = "+ dateFormat.format(date));
					
				}
				else {
					Date date = new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for task name -"+s+" = "+ dateFormat.format(date));
					
				}
				Thread.sleep(1000);
			}
			System.out.println(s + " complete");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	
	
}
