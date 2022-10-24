package sync_Method_level_Print_Tables;

public class Table {

	int n;
	
	public synchronized void printtable(int n) {
		
		System.out.println("Table of "+n+":");
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n*i);
		}
		
		System.out.println("----------");
	}
	
}
