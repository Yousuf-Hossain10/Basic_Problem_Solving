package LinkedList;

public class IntroductionToLL {

	private Node head;
	private Node tail;
	private int  size;
	
	public IntroductionToLL() {
		
		this.size = 0;
	}
	
	public void insertAtFirst(int val) {
		
		Node node = new Node( val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			
			tail = head;
		}
		
		size = size+1;
	}
	
	public void insertAtMiddle(int val, int index) {
		
		if (index==0) {
			insertAtFirst(val);
			return;
		}
		
		if(index==size) {
			insertAtLast(val);
			return;
		}
		
		Node temp = head;
		
		for(int i =0;i<index;i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val, temp.next);
		
		temp.next = node;
		
		size = size+1;
	}
	
	public void insertAtLast(int  val) {
		
		if(tail ==  null) {
			insertAtFirst(val);
			return;
		}
		
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size= size+1;
	}
	
	public void printList() {
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.val + "->");
			temp= temp.next;
		}
		System.out.println("end");
	}
	
	
	private class Node {
		
		private int val;
		private Node next;
		
		public Node (int val) {
			this.val =  val;
		}
		
		public Node (int val, Node next) {
			
			this.val = val;
			this.next = next;
		}
	}
}
