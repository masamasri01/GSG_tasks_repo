
public class TestClass {

	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addFirst(1);
		sll.addFirst(2);
		sll.addFirst(3);
		sll.addFirst(4);
		sll.addFirst(5);
		sll.addFirst(6);
		sll.addFirst(7);
		sll.addFirst(8);
		sll.addFirst(9);
		sll.addFirst(10);
		sll.traverseLL();
		sll.deleteNthNode(3);
		sll.traverseLL();
	} 

}
