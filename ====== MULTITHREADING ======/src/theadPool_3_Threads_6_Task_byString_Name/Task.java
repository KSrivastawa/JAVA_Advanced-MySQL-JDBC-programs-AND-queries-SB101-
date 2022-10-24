package theadPool_3_Threads_6_Task_byString_Name;

public class Task extends Thread {

	String name;
	
	public Task(String name) {
		this.name = name;

	}
	
	@Override
	public void run() {
		
		System.out.println(name+ " job starts by thread: "+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+ " job completed by thread: "+ Thread.currentThread().getName());
		
	}
	
	
}
