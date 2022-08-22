package doubly;
import java.util.*;
public class insertion {
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

void append(int data) {
	Node newnode=new Node(data);
	if(head==null) {
		newnode.prev=head;
		head=newnode;
		return;
	}
	Node temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=newnode;
	newnode.prev=temp;
	newnode.next=null;
	
	
}
void insertbefore(int r,int data) {
	Node newnode=new Node(data);
	
	
	Node temp=head;
	while(temp.data!=r) {
		temp=temp.next;
	}
	newnode.prev=temp.prev;
	temp.prev=newnode;
	newnode.next=temp;
	if(newnode.prev!=null) {
		newnode.prev.next=newnode;
	}
	else {
		head=newnode;
	}
	
	
	
}

void insertafter(int r,int data) {
	Node newnode=new Node(data);
	Node temp=head;
	while(temp.data!=r) {
		temp=temp.next;
	}
	newnode.next=temp.next;
	temp.next=newnode;
	newnode.prev=temp;
	if(newnode.next!=null) {
		newnode.next.prev=newnode;
	}
	else {
		newnode.next=null;
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
	insertion i=new insertion();
	i.push(3);
	i.push(7);
	i.printlist();
	i.append(4);
	i.printlist();
	i.insertbefore(7, 11);
	i.printlist();
	i.insertbefore(3, 111);
	i.printlist();
	i.insertafter(4, 77);
	i.printlist();
	i.insertafter(7, 777);
	i.printlist();
}

}
