package LinkedList;

public class Insertion_LinkedList {
	
	// to maintain Node
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	// Insert Function
	public static class linkedList{
		Node head;
		Node tail;
		  
		// insert at Head
		void insertAtHead(int val) {
			Node temp=new Node(val);
			if(head==null)
			{
				head=temp;
				tail=temp;
			}
			else {
				temp.next=head;
				head=temp;
			}
		}
		void insertAtend(int val) {
			Node temp=new Node(val);
			if(head==null)
				{
					head=temp;
				}
			else
				{
					tail.next=temp;
				}
			tail=temp;
		}
		
		//Display Function
		void display() 
			{
			Node temp=head;
				while(temp!=null) {
					System.out.print(temp.data+"  ");
					temp=temp.next;
				}
			}
		// Size function
		int size()
			{
			Node temp=head;
				int count=0;
				while(temp!=null) {
					count++;
					temp=temp.next;
				}
				return count;
			}
	
	// insert at any index
		void insertAtAny(int idx,int val)
			{
				Node t=new Node(val);
				Node temp=head;
				if(idx==0) {
					insertAtHead(val);
					return;
				}
				for(int i=1;i<=idx-1;i++)
				{
					temp=temp.next;
				}
				t.next=temp.next;
				temp.next=t;
			}
			}
		public static void main(String[] args) {
			linkedList li=new linkedList();
			li.insertAtHead(12);
			li.insertAtend(4);
			li.insertAtend(6);
//			li.display();
			li.insertAtHead(67);
//			li.display();//67  12   4   6
			li.insertAtAny(1, 5);
			li.insertAtAny(0, 100);
//			li.display();
			System.out.println();
			System.out.println(li.size());
//			System.out.println(li.tail.data);
//			System.out.println(li.head.data);
			li.display();
			
		}
	}
	