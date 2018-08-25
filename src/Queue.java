
public class Queue {

	private static class Node{
		private int data;
		private Node next; //anything not initialized is = to null (i think)

		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;
	
	public Queue()
	{
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int peek()
	{
			return head.data;	
	}
	
	
	public void add (int data)
	{
		Node node = new Node(data);
		if (tail != null)
		{
			tail.next = node;
		}
		tail = node;
		if (head == null)
		{
			head = node;
		}
	}
	
	public int remove()
	{
		int data = head.data;
		head = head.next;
		if (head == null) 
		{
			tail = null;
		}
		return data;
	}
	
	public void print()
	{
		Node walker = head;
		while(walker != null)
		{
			System.out.printf("%d\n", walker.data);
			walker = walker.next;
		}
		if(walker == null)
			{
				System.out.println("Queue is null");

			}
		
	}
}
