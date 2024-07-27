
public class SinglyLinkedList {
	public SinglyLinkedList() {
		this.head = null;
	}

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	public void addFirst(int val) {
		Node n = new Node(val);
		if(head == null) {
			head = n;
		}
		else {
			n.setNext(head);
			head = n;
		}
	}
	public void traverseLL() {
		 Node current = head;
		 while ( current!= null) {
			 System.out.println(current.getVal());
			 current = current.getNext();
		 }
		 System.out.println("done!");
	}
	
	/*
	 * writr a function to delete the Nth node from the end of singly linked list
	 */
	public void deleteNthNode(int n) {
		Node p1 = head;
		Node p2 = head;
		while(n>0) {
			n--;
			p2 = p2.getNext();
			if( p2 == null) {
				System.out.println("invalid, n is larger than length");
				 return;
			}
		}
		
		
		
		while(p2.getNext()!=null) {
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		Node tmpToDelete = p1.getNext();
		p1.setNext(tmpToDelete.getNext());
		tmpToDelete = null;
		
	}
}
