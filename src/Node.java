
public class Node {
	
	int data;
	Node next;
	
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	public Node getNext() 
	{
		return next;
	}

}
