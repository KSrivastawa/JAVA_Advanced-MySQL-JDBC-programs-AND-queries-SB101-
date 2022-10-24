package isAlive__returns_boolean;

public class OneThreadisAlive extends Thread {

	@Override
	public void run() {
		System.out.println("first");
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
			
			try {
				
				System.out.println("inside try");
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.fillInStackTrace();
			}
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
	
		OneThreadisAlive oneThread = new OneThreadisAlive();
		OneThreadisAlive oneThread2 = new OneThreadisAlive();
		
		System.out.println(oneThread.isAlive());  // false
		
		oneThread.start();
		oneThread2.start();
		
		System.out.println(oneThread.isAlive()); // true
		System.out.println(oneThread2.isAlive()); // true
		
	}


}
