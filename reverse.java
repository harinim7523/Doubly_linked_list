package doubly;
import java.util.*;

import doubly.deletion.Node;
public class reverse {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data=d;
			prev=null;
			next=null;
			
		}
		
	}
	
	void push(int data) {
		Node newnode=new Node(data);
		newnode.prev=null;
		newnode.next=head;
		if(head!=null) {
			head.prev=newnode;
		}
		
		head=newnode;
		
	}
	
	void rev() {
		Node current=head;
		Node temp=null;
		while(current!=null) {
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		
		if(temp!=null) {
			head=temp.prev;
		}
	}

	void printlist() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("NULL \n");
	}


	public static void main(String args[]) {
		reverse d=new reverse();
		d.push(2);
		d.push(3);
		d.push(4);
		d.push(5);
		d.push(6);
		d.push(7);
		d.push(8);
		d.printlist();
		d.rev();
		d.printlist();
		
		
	}
}
