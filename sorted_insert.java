package doubly;
import java.util.*;
public class sorted_insert {
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

void append(int data) {
	Node newnode=new Node(data);
	if(head==null) {
		newnode.prev=head;
		head=newnode;
		return;
	}
	Node temp=head;
	while(temp.next!=null && temp.next.data<=data) {
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
	sorted_insert i=new sorted_insert();
	i.append(1);
	i.append(5);
	i.append(3);
	i.append(4);
	i.append(2);
	i.printlist();
	
}

}
