public class Main {
	public static void main(String args[]) {
		RideList rideList = new RideList();
		rideList.addRide("Shariq", "6th Road", "DHA Phase 2", 1400);
		rideList.addRide("Ali", "F-11", "DHA Phase 4", 1800);
		rideList.addRide("Hassan", "E-11", "B-12", 1100);
		rideList.displayData();
		rideList.assignRide();
		System.out.println("After Assigning");
		rideList.displayData();
		rideList.cancelRide("Hassan");
		System.out.println("After Cenceling");
		rideList.displayData();
	}
}
