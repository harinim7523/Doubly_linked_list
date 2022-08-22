package doubly;
import java.util.*;
public class remove_dup_sorted{
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
	while(p1.next!=null) {
		if(p1.data==p1.next.data) {
			delete(p1.next);
		}
		else {
			p1=p1.next;
		}
		
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
	remove_dup_sorted d=new remove_dup_sorted();
	d.push(7);
	d.push(7);
	d.push(6);
	d.push(5);
	d.push(4);
	d.push(4);
	d.push(3);
	d.push(3);
	d.printlist(d.head);
	d.delall();
	d.printlist(d.head);
	
}

}
