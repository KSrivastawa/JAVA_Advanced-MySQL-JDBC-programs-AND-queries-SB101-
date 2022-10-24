package sync_Static_Bank_Transaction_by_2_Different_objects;

public class Main {

	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		
		StaticMethod1 method1 = new StaticMethod1(bank1, 6000.50);
		StaticMethod1 method12 = new StaticMethod1(bank1, 3700.57);
		StaticMethod1 method13 = new StaticMethod1(bank1, 4000.57);
		
		
		Bank bank2 = new Bank();
		
		StaticMethod1 method14 = new StaticMethod1(bank2, 6000.50);
		StaticMethod1 method15 = new StaticMethod1(bank2, 2000.57);
		StaticMethod1 method16 = new StaticMethod1(bank2, 3700.57);
		
		
		method1.setName("Ketan"); method12.setName("Rohit"); method13.setName("Kesri");
		method14.setName("Prashant"); method15.setName("Riku"); method16.setName("Rahul");
		
		method1.start(); method12.start(); method13.start(); method14.start(); method15.start(); method16.start();
		
		

	}

}
