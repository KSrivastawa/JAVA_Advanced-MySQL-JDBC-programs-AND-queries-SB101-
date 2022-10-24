package sync_InterThreads_Communication_Producer_and_Consumer_by_wait_and_Notify;

public class Main {

	public static void main(String[] args) {
		
		Company company = new Company();
		
		Producer producer = new Producer(company);
		Consumer consumer = new Consumer(company);
		
		producer.start();
		consumer.start();
		

	}

}
