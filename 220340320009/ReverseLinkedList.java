import java.lang.*;
import java.util.*;
public class ReverseLinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	void append(int data){
		if(head==null){
			head= new Node(data);
			return;
		}
		else{
			Node add = new Node(data);
			Node trav= head;
			while(trav.next!=null){
				trav=trav.next;
			}
			trav.next=add;
		}
	}
	void display(Node head){
		if(head==null){
			System.out.println("LinkedList is Empty");
		}
		else{
			Node trav= head;
			while(trav!=null){
				System.out.print(trav.data+" ");
				trav=trav.next;
			}
		}
	}
	Node reverse(Node head){
		
		Node trav=head;
		/* while(trav.next!=null){
				trav=trav.next;
			}*/
			if(trav.next.next.next.next !=null){
			Node a= trav.next.next.next.next;
			Node b= trav.next.next.next;
			Node c= trav.next.next;
			Node d= trav.next;
			Node e= trav;
			a.next=b;
			b.next=c;
			c.next=d;
			d.next=e;
			e.next=null;
			return a;
			}
		
		    Node b= trav.next.next.next;
			Node c= trav.next.next;
			Node d= trav.next;
			Node e= trav;
			
			b.next=c;
			c.next=d;
			d.next=e;
			e.next=null;
			return b;
	}
	public static void main(String args[]){
		ReverseLinkedList rl= new ReverseLinkedList();
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter Size of LinkedList");
		int n=ss.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements of List");
		for(int i=0;i<n;i++){
			arr[i] = ss.nextInt();
		}
		rl.head= new Node(arr[0]);
		for(int i=1;i<n;i++){
			rl.append(arr[i]);
		}
		System.out.println();
		//System.out.println("Entered Linked List is : "+'\n');
		
		//rl.display(rl.head); OUTPUT : 1 2 3 4 5
		Node rev = rl.reverse(rl.head);
		System.out.println('\n'+"Reversed Linked List is : "+'\n');
		rl.display(rev);
	}
}