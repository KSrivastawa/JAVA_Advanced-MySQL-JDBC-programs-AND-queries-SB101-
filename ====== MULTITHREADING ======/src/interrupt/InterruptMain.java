package interrupt;

public class InterruptMain {

	public static void main(String[] args) {
		
		Interrupt interrupt1 = new Interrupt();
		Interrupt2 interrupt2 = new Interrupt2();
		
		interrupt1.start();
		interrupt1.interrupt();  // this is applicable when thread is in waiting state

		interrupt2.start();
		interrupt2.interrupt();  // this is applicable when thread is in waiting state
		
		
	}

}
