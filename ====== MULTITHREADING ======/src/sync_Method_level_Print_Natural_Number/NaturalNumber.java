package sync_Method_level_Print_Natural_Number;

public class NaturalNumber {

	int n;
	
	public synchronized void printOddNaturalNumber(int n) {
		
		System.out.println("All Odd natural numbers from 1 to "+n+":");
		
		for(int i=1; i<=n; i++) {
			if(i%2==1)
			System.out.println(i);
		}
		
		System.out.println("---------");
	}
	
	
	
}
