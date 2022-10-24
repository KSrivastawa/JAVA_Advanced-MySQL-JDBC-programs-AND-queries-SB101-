package i_Join_and_Sleep;

public class Sleep extends Thread {

	@Override
	public void run() {
		
		String s = Thread.currentThread().getName();
		
		for(int i=0; i<3; i++) {
			
			System.out.println(s);
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
