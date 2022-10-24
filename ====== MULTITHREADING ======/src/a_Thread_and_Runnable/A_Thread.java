package a_Thread_and_Runnable;

public class A_Thread extends Thread {

	public void run() {
		
		for(int i=0; i<6; i++) {
			System.out.println(i);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		A_Thread a_Thread = new A_Thread();
		A_Thread a_Thread2 = new A_Thread();
		
		
		a_Thread.start();
		a_Thread2.start();
		
		

	}

}
