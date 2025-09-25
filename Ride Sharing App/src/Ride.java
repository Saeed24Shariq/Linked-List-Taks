public class Ride {
	String customerName;
	String pickupLoc;
	String dropLoc;
	double fare;
	
	public Ride(String customerName, String pickupLoc, String dropLoc, double fare) {
		this.customerName = customerName;
		this.pickupLoc = pickupLoc;
		this.dropLoc = dropLoc;
		this.fare = fare;
	}
}