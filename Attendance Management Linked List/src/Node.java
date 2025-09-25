public class Node {
	Student data;
	Node next;
	
	public Node(String rollNo, String name, String status) {
		data = new Student();
		data.rollNo = rollNo;
		data.name = name;
		data.status = status;
		next = null;
	}
}
