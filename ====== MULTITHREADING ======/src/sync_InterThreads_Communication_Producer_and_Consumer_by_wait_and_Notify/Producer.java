package sync_InterThreads_Communication_Producer_and_Consumer_by_wait_and_Notify;

public class Producer extends Thread {

	Company company;
	
	public Producer(Company company) {
		this.company = company;
		
	}
	
	@Override
	public void run() {
		
			int i=1;
			while(i <= company.target) {
				
				this.company.production(i);
		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				i++;
			}
		
	}
	
}
