package interrupt;

public class Interrupt2 extends Thread {

	@Override
	public void run() {
		try {
		for(int i=0; i<4; i++) {
			System.out.println("interrupt2 thread is running...");
			
			
				Thread.sleep(1000);
			}	
		} catch (InterruptedException e) {
				
			System.out.println("interrupt2 is terminated by interruption");
		}
		
	}
	
	
}
