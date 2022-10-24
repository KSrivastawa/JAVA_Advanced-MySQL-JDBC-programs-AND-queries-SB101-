package yeild;

public class YieldMain {

	public static void main(String[] args) {

		Yield yield1 = new Yield();
		Yield2 yield2 = new Yield2();
		
		yield1.setName("Ketan");
		yield2.setName("Prashant");
		
		yield1.start();
		yield2.start();
		
		

	}

}
