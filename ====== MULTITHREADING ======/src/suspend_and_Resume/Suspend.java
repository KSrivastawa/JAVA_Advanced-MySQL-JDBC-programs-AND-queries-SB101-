package suspend_and_Resume;

public class Suspend extends Thread {

	@Override
	public void run() {

		String s = Thread.currentThread().getName();
		for(int i=0; i<3; i++) {
			System.out.println(s);
		}
		
	}
	
	
}
