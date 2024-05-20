package LinkedList;

import LinkedList.TraverseLinkedList.Node;

public class Nth_Node_End {
 static class Node{
	 int data;
	 Node next;
	 Node(int data){
		 this.data=data;
	 }
 }
	 static Node Nth2(Node head,int n) {
		 Node fast=head;
		 Node slow=head;
		 for(int i=1;i<=n;i++) {
			 fast=fast.next;
		 }
		 while(fast!=null) {
			 slow=slow.next;
			 fast=fast.next;
		 }
		 return slow;
	 }
	 
//	 starting 
	 static Node startNth2(Node head,int n) {
		 Node fast=head;
		 Node slow=head;
		 for(int i=n;i<=n;i++) {
			 slow=slow.next;
		 }
		 while(slow!=null) {
			 fast=fast.next;
			 slow=slow.next;
		 }
		 return fast;
	 }
	static Node  NthDel2(Node head,int n){
		 Node fast=head;
		 Node slow=head;
		 for(int i=1;i<=n;i++) {
			 fast=fast.next;
		 }
		 if(fast==null) {
			 head=head.next;
			 return head;
		 }
		 while(fast.next!=null) {
			 slow=slow.next;
			 fast=fast.next;
		 }
		slow.next=slow.next.next;
		return head;
	 }
 
	static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		 Node a=new Node(2);
	      Node b=new Node(3);
	      Node c=new Node(4);
	      Node d=new Node(5);
	      Node e=new Node(6);
	      a.next=b;
	      b.next=c;
	      c.next=d;
          d.next=e;   // 2  3  4  5  6
//          display(a);
//	      Node q=Nth2(a,1);
//	      System.out.println(q.data);
//          Node q=startNth2(a,5);
//          display(a);
//          System.out.println(q.data);
	      a=NthDel2(a,4);
	      display(a);
	}
	
}
