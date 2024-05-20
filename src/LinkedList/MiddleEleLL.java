package LinkedList;

import LinkedList.TraverseLinkedList.Node;

public class MiddleEleLL {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	static Node middEle(Node head) {
		Node fast=head;
		Node slow=head;
		while(fast!=null) 
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
		
	}
	public static void main(String[] args) {
		  Node a=new Node(2);
	      Node b=new Node(3);
	      Node c=new Node(4);
	      Node d=new Node(5);
	      Node e=new Node(6);
	      Node f=new Node(7);
	      Node g=new Node(8);
	      Node h=new Node(9);
	      Node i=new Node(10);
	      Node j=new Node(11);  //2,3,4,5,6,7,8,9,10,11
	      a.next=b;
	      b.next=c;
	      c.next=d;
	      d.next=e;
	      e.next=f;
	      f.next=g;
	      g.next=h;
	      h.next=i;
	      i.next=j;
	      Node q=middEle(a);
	      System.out.println(q.data);
}
}
