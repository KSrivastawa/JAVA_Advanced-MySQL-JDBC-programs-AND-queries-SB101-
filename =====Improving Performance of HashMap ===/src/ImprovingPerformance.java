import java.util.HashMap;
import java.util.Map;

public class ImprovingPerformance {

	public static void main(String[] args) {

		Map<Student, String> hm = new HashMap<>();
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			hm.put(new Student("Ketan"+i), "Prashant"+i);
		}
		
		hm.forEach((K, V)-> System.out.println(K+" : "+V));
		
		long endTime = System.currentTimeMillis();
		
		long timeElapsed = endTime - startTime;   // final time calculation
		
		System.out.println("\n Execution time in milliseconds for In-Efficient hashcode :  "
	            + timeElapsed + " milliseconds.");
		
		
		
	}

}
