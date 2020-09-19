package question;

public class SingleLinkedList {
	class Node{
		private String data;
		private Node next;

		public Node(String data) {
			this.data=data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNodes(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next=newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		
		if(head==null) {
			System.out.println("List is empty.");
			return;
		}
		
		while(current != null) {
			System.out.println("Data in node at address "+current+" is "+current.data);
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.addNodes("Hello");
		sl.addNodes("Hi");
		sl.addNodes("12345");
		sl.addNodes("Hola!!!");
		
		sl.display();
	}
}
