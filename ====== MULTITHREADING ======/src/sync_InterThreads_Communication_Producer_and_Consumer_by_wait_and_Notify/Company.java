package sync_InterThreads_Communication_Producer_and_Consumer_by_wait_and_Notify;

public class Company {

	int product;
	int target = 20;
	
	boolean flag = false;
	
	public synchronized void production(int product) {
		
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.product = product;
		System.out.println("Producer produced : "+this.product);
		flag = true;
		notify();
		
	}

	public synchronized int consuption() {
		
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Consumer consumed : "+this.product);
		flag = false;
		notify();
		return this.product;
		
	}
	
	
}
