package LinkedList;

public class MergeTwoLL {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	static Node getInetersection(Node headA,Node headB) {
		
		Node tempA=headA;
		Node tempB=headB;
		int lengthA=0;
		while(tempA!=null) 
		{
			lengthA++;
			tempA=tempA.next;
		}
		int lengthB=0;
		while(tempB!=null)
		{
			lengthB++;
			tempB=tempB.next;
		}
		tempA=headA;
		tempB=headB;
		if(lengthA>lengthB)
		{
			int steps=lengthA-lengthB;
			for(int i=0;i<=steps;i++) {
				tempA=tempA.next;
		}
		}
		else {
			int steps=lengthB-lengthA;
			for(int i=0;i<=steps;i++) {
				tempB=tempB.next;
		}
			while(tempA!=tempB) {
				tempA=tempA.next;
				tempB=tempB.next;
			}
		
		}
		return tempA;
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
	      Node k=getInetersection(e, h);
	      System.out.println(k.data);
	}

}
