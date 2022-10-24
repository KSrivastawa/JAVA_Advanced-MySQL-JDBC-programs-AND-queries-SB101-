package sync_Static_Bank_Transaction_by_2_Different_objects;

public class Bank {

	static double balance = 10000.00;
	static double customerWithdrawal;
	
	public static synchronized void withdrawAmount(double customerWithdrawal ) {
		
		String name = Thread.currentThread().getName();
		try {
			
			  if(balance >= customerWithdrawal) {
					System.out.println(name.toUpperCase() +" your Withdrawal process is done...!");
					
					balance = balance - customerWithdrawal;
				
				}
				else {
					System.out.println("Sorry "+name.toUpperCase()+" you have Inssuficient balance...!");
				}
			
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			

	}
	
	
}
