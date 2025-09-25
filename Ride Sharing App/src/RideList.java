public class RideList {
	Node start;
	// constructor
	public RideList() {
		start = null;
	}
	
	// adding ride
	public void addRide(String customerName, String pickLoc, String dropLoc, double fare) {
		Node newNode = new Node(customerName, pickLoc, dropLoc, fare);
		if(start == null) {
			start = newNode;
		}
		else {
			Node lastNode = searchLast();
			lastNode.nextNode = newNode;
		}
	}
	
	// assigning ride
	public void assignRide() {
		Node temp = start;
		start = temp.nextNode;
	}
	
	// canceling ride
	public void cancelRide(String customerName) {
		Node previousNode = previousRide(customerName);
		Node currentNode = searchRide(customerName);
		Node nextNode = currentNode.nextNode;
		if(previousNode == null) {
			start = nextNode;
		}
		else {
			previousNode.nextNode = nextNode;
		}
	}
	
	// previous ride search
	public Node previousRide(String customerName) {
		Node temp = start;
		try{
			while(temp != null) {
				if(temp.nextNode.data.customerName == customerName) {
					return temp;
				}
				temp = temp.nextNode;
			}
			return null;	
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
	// searching a specific ride
	public Node searchRide(String customerName) {
		Node temp = start;
		while(temp.data.customerName != customerName) {
			temp = temp.nextNode;
		}
		return temp;
	}
	
	// searching the last ride
	public Node searchLast() {
		Node temp = start;
		while(temp.nextNode != null) {
			temp = temp.nextNode;
		}
		return temp;
	}
	
	// displaying all queued rides
	public void displayData() {
		Node temp = start;
		while(temp != null) {
			System.out.println("Name: " + temp.data.customerName +
					"\nPickUp Location: " + temp.data.pickupLoc +
					"\nDrop Location: " + temp.data.dropLoc +
					"\nFare: " + temp.data.fare +
					"\n-------------------");
			temp = temp.nextNode;
		}
	}
}
