package sync_Book_Bus_Tickect_passengerANDseats;

public class Booking {

	public static void main(String[] args) {

		Bus bus = new Bus(3, 1);  // here passenger should be always 1 at a time
		
		Thread thread1 = new Thread(bus);
		Thread thread2 = new Thread(bus);
		Thread thread3 = new Thread(bus);
		Thread thread4 = new Thread(bus);
		Thread thread5 = new Thread(bus);
		
		thread1.setName("Ketan"); thread2.setName("Kesri"); thread3.setName("Rahul"); thread4.setName("Prashant"); thread5.setName("Rohit");
		
		thread1.start(); thread2.start(); thread3.start(); thread4.start(); thread5.start();
		

	}

}
