package setPriority.getPriority;

public class PriorityMain {

	public static void main(String[] args) {
		
		Priority priority1 = new Priority();
		Priority priority2 = new Priority();
		Priority priority3 = new Priority();
		
		priority1.setName("Ketan");
		priority2.setName("Prashant");
		priority3.setName("Riku");
		
		priority1.setPriority(10);
		priority2.setPriority(2);
		priority3.setPriority(5);
		
		priority1.start();
		priority2.start();
		priority3.start();
		

	}

}
