
public class LinkedList {
	
	Node head;
	
	public LinkedList(Node head)
	{
		this.head =  head;
	}
	
	public void add(int data)
	{
		Node newNode = new Node(data,null);
		head.setNext(newNode);
	}

}
