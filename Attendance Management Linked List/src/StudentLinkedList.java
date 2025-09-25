public class StudentLinkedList {
	Node start;
	
	public StudentLinkedList() {
		start = null;
	}
	// Adding Student
	public  void addStudent(String rollNo, String name, String status) {
		Node newNode = new Node(rollNo, name, status);
		
		if(start == null) {
			start = newNode;
		}
		else {
			Node lastNode = searchLast();
			lastNode.next = newNode;
		}
	}
	// Removing Student
	public void removeStudent(String rollNo) {
		Node previousNode = previousStudent(rollNo);
		Node nextNode = nextStudent(rollNo);
		if(previousNode == null) {
			start = nextNode;
		}
		else {
			previousNode.next = nextNode;
		}
	}
	// searching previous student
	public Node previousStudent(String rollNo) {
		Node temp = start;
		try {
			while(!temp.next.data.rollNo.equalsIgnoreCase(rollNo)) {
				temp = temp.next;
			}	
			return temp;
		}
		catch(Exception e) {
			return null;
		}
	}
	// searching a student with roll no
	public Node searchStudent(String rollNo) {
		Node temp = start;
		
		while(temp != null) {
			if(temp.data.rollNo.equalsIgnoreCase(rollNo)) {
				System.out.println("Roll Number: " + temp.data.rollNo +
						"\nName: " + temp.data.name +
						"\nStatus: " + temp.data.status +
						"\n-------------------");
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	// Updating Attendance
	public void updateAttandence(String rollNo, String status) {
		Node stdNode = searchStudent(rollNo);
		if(stdNode == null) {
			System.out.println("Record Not Found");
		}
		else {
			stdNode.data.status = status;	
		}
	}
	
	// searching next student
	public Node nextStudent(String rollNo) {
		Node temp = start;
		while(!temp.data.rollNo.equalsIgnoreCase(rollNo)) {
			temp = temp.next;
		}
		return temp.next;
	}
	
	// searching last student
	public Node searchLast() {
		Node temp = start;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}
	
	// displaying students
	public void display() {
		Node temp = start;
		while(temp != null) {
			System.out.println("Roll Number: " + temp.data.rollNo +
					"\nName: " + temp.data.name +
					"\nStatus: " + temp.data.status +
					"\n-------------------");
			temp = temp.next;
		}
	}
}
