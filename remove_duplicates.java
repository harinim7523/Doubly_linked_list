
package doubly;
import java.util.*;
public class remove_duplicates {
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
void delete(Node del) {
	if(head==del) {
		head=head.next;
	}
	if(del.next!=null) {
		del.next.prev=del.prev;
	}
	if(del.prev!=null) {
		del.prev.next=del.next;
	}
	del=null;
	
	
}

Node delall() {
	if(head==null) {
		return null;
	}
	Node p1=head;
	Node next;
	while(p1.next!=null) {
		Node p2=p1.next;
		while(p2!=null) {
			if(p1.data==p2.data) {
				delete(p2);
			}
			p2=p2.next;
		}
		p1=p1.next;
	}
	return head;
}

void printlist(Node head) {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("NULL \n");
}


public static void main(String args[]) {
	remove_duplicates d=new remove_duplicates();
	d.push(2);
	d.push(3);
	d.push(5);
	d.push(4);
	d.push(5);
	d.push(6);
	d.push(6);
	d.push(7);
	d.push(5);
	d.push(8);
	d.printlist(d.head);
	d.delall();
	d.printlist(d.head);
	
}

}
