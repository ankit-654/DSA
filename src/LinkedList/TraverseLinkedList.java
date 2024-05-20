package LinkedList;

public class TraverseLinkedList {
	static void Display(Node head) {
		while(head!=null) {
			System.out.print(head.data + " ");
			head=head.next;
		}
	}
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
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
      Node temp=a;
      
   // ********** via while Loop ********** 
//      while(temp!=null) {
//    	  System.out.print(temp.data+" ");
//    	  temp=temp.next; // this means temp is currently at a but in contains 
//                           //  refernce of next node and value or data of that node
//      }
 // second time it will not print anything bcoz head of LL get used and not be able for 2nd time
//      while(temp!=null) {
//    	  System.out.print(temp.data+" ");
//    	  temp=temp.next; // this means temp is currently at a but in contains 
//                           //  refernce of next node and value or data of that node
//      }
    
      // ********** via for loop ********** 
//      for(int i=1;i<=5;i++) {
//    	  System.out.println(temp.data);
//      temp=temp.next;
//      }	
      Display(a);
      System.out.println();
      Display(a);
	}

}
