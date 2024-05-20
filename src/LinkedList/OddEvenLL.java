package LinkedList;

public class OddEvenLL {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
		
		static Node OddEvenLinked(Node head){
			Node even=head;
			Node odd=head;
			Node hold=even;
			int count=0;
			while(odd.next!=null && even.next!=null) {
				count ++;
				if(count%2==1) {
					odd.next=even.next;
					odd=odd.next;
				}
				else {
					even.next=odd.next;
					even=even.next;
				}
			}
			if(count%2==1) {
				even.next=null;
			}
		odd.next=hold;
		return head;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Node a=new Node(2);
	      Node b=new Node(3);
	      Node c=new Node(4);
	      Node d=new Node(5);
	      Node e=new Node(6);
	      a.next=b;
	      b.next=c;
	      c.next=d;
          d.next=e;
		  Node q=a.OddEvenLinked(a);
          System.out.println(q.data);
	}

}
