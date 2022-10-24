

public class ImprovingPerformance2 {

	public static void main(String[] args) {
		
		
		long st = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			System.out.println("Ketan");
		}
		
		long et = System.currentTimeMillis();
		
		long finalTime = et - st;
		
		System.out.println("total time: "+finalTime+"milliseconds");
		
		
	}
}





