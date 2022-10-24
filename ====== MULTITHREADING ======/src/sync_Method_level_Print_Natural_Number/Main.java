package sync_Method_level_Print_Natural_Number;

public class Main {

	public static void main(String[] args) {

		NaturalNumber number = new NaturalNumber();
		
		Method1 method1 = new Method1(number, 15);
		Method2 method2 = new Method2(number, 29);
		
		method1.start();
		method2.start();
		
		
	}

}
