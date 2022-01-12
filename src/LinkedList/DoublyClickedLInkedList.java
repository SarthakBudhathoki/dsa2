package LinkedList;

public class DoublyClickedLInkedList {
	
	public static class Node{
		Node prev;
		Node next;
		int data;
		
		Node(int data){
			this.prev=null;
			this.next=null;
			this.data=data;
		}
		
	}
	
	Node head=null;
	Node tail=null;
	
	public void addNode(int data) {
		Node newnode=new Node(data);
		
		if(head==null) {
			head=tail=newnode;
		}
		else {
			
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
			
		}
		
		
	}

}
