package calculate_product_Use_Wait_and_Notify_Block_Level;

public class ThreadCalculate extends Thread {

	long product = 1; 
	
	public void run() {
			
		synchronized (this) {
			
			for(int i=1; i<=10; i++) {
				
				product = product * i;
				
			}
			
			this.notify();
		}
	
	
		
	}
	
}
