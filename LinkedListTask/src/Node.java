
public class Node {
	public Node(int val) {
		this.val = val;
		this.next =  null;
	}
	private int  val;
	private Node next;
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
