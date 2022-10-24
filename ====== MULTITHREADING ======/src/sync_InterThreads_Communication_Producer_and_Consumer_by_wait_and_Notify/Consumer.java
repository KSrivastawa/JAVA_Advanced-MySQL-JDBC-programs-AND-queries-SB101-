package sync_InterThreads_Communication_Producer_and_Consumer_by_wait_and_Notify;

public class Consumer extends Thread {

	Company company;
	
	public Consumer(Company company) {
		this.company = company;
		
	}
	
	@Override
	public void run() {
		
			while(company.product <= company.target) {
				
				this.company.consuption();
		
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		
	}
	
}
