package a_Thread_and_Runnable;

public class A_Runnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=1; i<5; i++) {
			System.out.println(i+3);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		A_Runnable a_Runnable = new A_Runnable();
		A_Runnable a_Runnable2 = new A_Runnable();
		
		Thread thread = new Thread(a_Runnable);
		Thread thread2 = new Thread(a_Runnable2);
		
		thread.start();
		thread2.start();
		
		
		

	}

}
