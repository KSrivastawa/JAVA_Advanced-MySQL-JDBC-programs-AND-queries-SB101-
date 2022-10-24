package sync_Book_Bus_Tickect_passengerANDseats;

public class Bus implements Runnable {

	int seats, passenger;
	
	public Bus(int seats, int passenger) {
		
		this.seats = seats;
		this.passenger = passenger;
		
	}
	
	
	@Override
	public synchronized void run() {
		
		String name = Thread.currentThread().getName();
		if(seats>= passenger) {
			System.out.println(name.toUpperCase() + " has booked ticket..!");
			seats = seats - passenger;

		}
		else {
			System.out.println("Sorry "+name.toUpperCase() +" seats are not available..!");
		}
		
		
		
	}
	
	
}
