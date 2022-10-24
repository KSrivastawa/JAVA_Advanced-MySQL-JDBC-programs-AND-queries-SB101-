package sync_Method_level_Print_Tables;

public class Method2 extends Thread {

	Table t;
	int number;
	
	public Method2(Table t, int number) {
		this.t = t;
		this.number = number;
	}
	
	@Override
	public void run() {
		
		t.printtable(number);
		
	}
	
}
