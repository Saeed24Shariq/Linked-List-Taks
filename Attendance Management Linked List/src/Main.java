public class Main {
	public  static void main(String args[]) {
		StudentLinkedList stdLinkedList = new StudentLinkedList();
		stdLinkedList.addStudent("2024-Arid-4099", "Shariq Saeed", "Present");
		stdLinkedList.addStudent("2024-Arid-4067", "Qazi Huzaifa", "Present");
		stdLinkedList.addStudent("2024-Arid-3976", "Usman Khan", "Absent");
		stdLinkedList.display();
		System.out.println("After Removing");
		stdLinkedList.removeStudent("2024-Arid-4067");
		stdLinkedList.display();
		System.out.println("Searching: ");
		stdLinkedList.searchStudent("2024-Arid-4099");
	}
}
