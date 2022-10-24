package interrupt;

public class Interrupt extends Thread {

	@Override
	public void run() {
		for(int i=0; i<4; i++) {
			System.out.println("interrupt1 thread is running...");
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				System.out.println("interrupt1 is terminated by interruption");
			}
		}
	}
	
	
}
