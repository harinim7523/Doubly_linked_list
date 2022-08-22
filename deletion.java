package doubly;
import java.util.*;

import doubly.insertion.Node;
public class deletion {
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

void delfirst() {
	Node temp=head;
	head=head.next;
	head.prev=null;
	
}

void dellast() {
	Node temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.prev.next=null;
	
}

void delbefore(int data) {
	Node temp=head;
	while(temp.data!=data) {
		temp=temp.next;
	}
	if(temp.prev.prev!=null) {
	Node t=temp.prev;
	t.prev.next=t.next;
	t.next.prev=t.prev;
	}
	else {
		temp.prev=null;
		head=head.next;
	}
}

void delafter(int data) {
	Node temp=head;
	while(temp.data!=data) {
		temp=temp.next;
	}
	if(temp.next.next!=null) {
	Node t=temp.next;
	t.prev.next=t.next;
	t.next.prev=t.prev;
	}
	else {
		temp.next=null;
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
	deletion d=new deletion();
	d.push(2);
	d.push(3);
	d.push(4);
	d.push(5);
	d.push(6);
	d.push(7);
	d.push(8);
	d.printlist();
	d.delfirst();
	d.printlist();
	d.dellast();
	d.printlist();
	
	d.delbefore(6);
	d.printlist();
	
	d.delbefore(4);
	d.printlist();

	d.delafter(4);
	d.printlist();
	
	d.delafter(6);
	d.printlist();
	
}

}
