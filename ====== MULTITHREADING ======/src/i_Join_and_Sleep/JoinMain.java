package i_Join_and_Sleep;

public class JoinMain {

	public static void main(String[] args) {
		
		Join join1 = new Join();
		Join join2 = new Join();
		Join join3 = new Join();
		
		join1.setName("Ketan");
		join2.setName("Prashant");
		join3.setName("Riku");
		
		join2.start();
		
		try {
			
			join2.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		join1.start();
		join3.start();

	}

}
