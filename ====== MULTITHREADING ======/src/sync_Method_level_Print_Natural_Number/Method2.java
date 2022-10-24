package sync_Method_level_Print_Natural_Number;

public class Method2 extends Thread {

	NaturalNumber nn;
	int number;
	
	public Method2(NaturalNumber nn, int number) {
		this.nn = nn;
		this.number = number;
	}
	
	@Override
	public void run() {
		nn.printOddNaturalNumber(number);
	}
	
}
