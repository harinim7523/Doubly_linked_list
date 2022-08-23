package doubly;
import java.util.*;
public class sum_triplet {
	Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
		
	}
}


void insert(int data) {
	Node newnode=new Node(data);
	newnode.next=head;
	head=newnode;
}

void sum(int s) {
	Node p=head;
	while(p.next.next!=null) {
		Node q=p.next;
		while(q.next!=null) {
			Node r=q.next;
			while(r!=null) {
				if((p.data+q.data+r.data)==s) {
					System.out.println("("+p.data+","+q.data+","+r.data+")");
				}
				r=r.next;
			}
			
			q=q.next;
		}
		p=p.next;
	}
}

void printlist() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println("NULL"+"\n");
}

public static void main(String args[]) {
	sum_triplet s=new sum_triplet();

	s.insert(1);
	s.insert(2);
	s.insert(3);
	s.insert(4);
	s.insert(5);
	s.insert(6);
	s.insert(7);
	s.printlist();
	s.sum(7);
	
	
	
	
}
}
