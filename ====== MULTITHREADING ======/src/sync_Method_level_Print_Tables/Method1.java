package sync_Method_level_Print_Tables;

public class Method1 extends Thread {

	Table t;
	int number;
	
	public Method1(Table t, int number) {
		this.t = t;
		this.number = number;
	}
	
	@Override
	public void run() {
		
		t.printtable(number);
		
	}

	
	
	
}
