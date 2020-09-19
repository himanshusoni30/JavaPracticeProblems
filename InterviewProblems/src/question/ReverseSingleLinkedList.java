package question;

public class ReverseSingleLinkedList {
	static class Node {
		private String data;
		private Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNodes(Node newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display(Node currentNode) {
		if (currentNode == null) {
			System.out.println("List is empty.");
			return;
		}

		while (currentNode != null) {
			System.out.println("Data in node at address " + currentNode + " is " + currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public Node reverseLinkedList(Node currentNode) {
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

	public static void main(String[] args) {
		ReverseSingleLinkedList sl = new ReverseSingleLinkedList();
		Node head = new Node("Start");
		sl.addNodes(head);
		sl.addNodes(new Node("Hello"));
		sl.addNodes(new Node("Hi"));
		sl.addNodes(new Node("12345"));
		sl.addNodes(new Node("Hola!!!"));

		sl.display(head);

		Node reverseHead = sl.reverseLinkedList(head);
		sl.display(reverseHead);
	}
}
