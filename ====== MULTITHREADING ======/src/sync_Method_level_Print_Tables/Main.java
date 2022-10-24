package sync_Method_level_Print_Tables;

public class Main {

	public static void main(String[] args) {
		
		Table table = new Table();
		
		Method1 method1 = new Method1(table, 5);
		Method2 method2 = new Method2(table, 9);
		
		method1.start();
		method2.start();
		
		
		

	}

}
