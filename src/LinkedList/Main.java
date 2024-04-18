package LinkedList;

public class Main {

	public static void main(String [] args) {
		
		IntroductionToLL list = new IntroductionToLL();
		list.insertAtFirst(1);
		list.insertAtFirst(2);
		list.insertAtFirst(3);
		list.insertAtFirst(4);
		list.printList();
		list.insertAtLast(5);
		list.insertAtLast(6);
		list.insertAtLast(7);
		list.printList();
		list.insertAtMiddle(8,6);
		list.printList();
	}
}
