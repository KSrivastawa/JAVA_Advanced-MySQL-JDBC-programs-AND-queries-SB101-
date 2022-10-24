package sync_Static_Bank_Transaction_by_2_Different_objects;

public class StaticMethod1 extends Thread {

	Bank bank;
	double customerWithrawal;
	
	public StaticMethod1(Bank bank, double customerWithrawal) {
		
		this.bank = bank;
		this.customerWithrawal = customerWithrawal;
	}
	
	public void run() {
		
		Bank.withdrawAmount(customerWithrawal);
		
	}
	
	
}
