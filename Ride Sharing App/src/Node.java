public class Node {
	Ride data;
	Node nextNode;
	
	public Node(String customerName, String pickLoc, String dropLoc, double fare) {
		data = new Ride(customerName, pickLoc, dropLoc, fare);
		nextNode = null;
	}
}
