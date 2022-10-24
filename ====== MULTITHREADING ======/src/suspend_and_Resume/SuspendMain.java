package suspend_and_Resume;

public class SuspendMain {

	public static void main(String[] args) {

		Suspend suspend1 = new Suspend();
		Suspend suspend2 = new Suspend();
		Suspend suspend3 = new Suspend();
		
		suspend1.setName("Ketan");
		suspend2.setName("Prashant");
		suspend3.setName("Riku");
		
		suspend1.start();
		suspend2.start();
		
		suspend2.suspend();
		
		suspend3.start();
		
		suspend2.resume();
		
		

	}

}
