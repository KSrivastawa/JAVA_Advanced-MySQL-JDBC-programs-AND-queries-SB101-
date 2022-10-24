package stop;

public class StopMain {

	public static void main(String[] args) {
		
		Stop stop1 = new Stop();
		Stop stop2 = new Stop();
		Stop stop3 = new Stop();
		
		stop1.setName("Ketan");
		stop2.setName("Prashant");
		stop3.setName("Riku");
		
		stop1.start();
		stop2.start();
		
		stop2.stop();  // killed and moved to dead state
		
		stop3.start();
		

	}

}
