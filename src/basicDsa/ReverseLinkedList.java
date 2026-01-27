package basicDsa;



public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		LinkedList.printList(list);
		
		System.out.println(".....................");
		
		Node pointer = reverseList(list);
		
		while(pointer!=null)
		{
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}

	private static Node reverseList(LinkedList list) {
		// TODO Auto-generated method stub
		Node current = list.head;
		Node prev = null;
		while(current!=null)
		{
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		return prev;
	}

}
