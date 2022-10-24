package sync_Method_level_Print_Natural_Number;

public class Method1 extends Thread {

	NaturalNumber nn;
	int number;
	
	public Method1(NaturalNumber nn, int number) {
		this.nn = nn;
		this.number = number;
	}
	
	@Override
	public void run() {
		nn.printOddNaturalNumber(number);
	}
	
}
