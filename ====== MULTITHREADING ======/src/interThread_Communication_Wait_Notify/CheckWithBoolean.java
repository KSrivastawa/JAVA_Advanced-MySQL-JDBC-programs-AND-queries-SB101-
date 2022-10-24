package interThread_Communication_Wait_Notify;

public class CheckWithBoolean {

	boolean part1Done = false;
	
	synchronized void part1() {
		
		System.out.println("Start part1");
		
		part1Done = true;
		
		System.out.println("End part1");
		
		this.notify();
		
	}
	
	synchronized void part2() {
		
		while(!part1Done) {
			
			try {
				
				System.out.println("Before wait");
				
				wait();
				
				System.out.println("After Wait");
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Finished");
		
	}

	
}
