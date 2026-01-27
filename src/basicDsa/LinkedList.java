package basicDsa;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
	
}


public class LinkedList {
	
	static Node head;
	
	public static void addNode(int data)
	{
		if(head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
	}
	
	public static void printList(LinkedList list)
	{
		Node temp = list.head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;

		}
		
	}

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.head = null;
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.printList(list);

		
	}

}
