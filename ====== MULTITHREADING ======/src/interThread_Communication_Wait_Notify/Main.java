package interThread_Communication_Wait_Notify;

public class Main {

	public static void main(String[] args) {
		
		CheckWithBoolean boolean1 = new CheckWithBoolean();
		
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {

				boolean1.part1();
				
			}
		});
		
		
      Thread thread2 = new Thread( new Runnable() {
			
			@Override
			public void run() {

				boolean1.part2();
				
			}
		});
		
      
      thread.start();
      thread2.start();
      

	}

}
