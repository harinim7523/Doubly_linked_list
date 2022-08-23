package doubly;
import java.util.*;

public class swap_k_start_and_end  {
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

int count() {
	Node tem=head;
	int c=0;
	while(tem!=null) {
		tem=tem.next;
		c++;
	}
	return c;
}

void swap(int k) {
	
	int n=count();
	
	Node x=head;
	Node xprev=null;
	for(int i=1;i<k;i++) {
		xprev=x;
		x=x.next;
	}
	
	Node y=head;
	Node yprev=null;
	for(int i=1;i<n-k+1;i++) {
		yprev=y;
		y=y.next;
	}
	
	if(xprev!=null){
		xprev.next=y;
	}
	
	if(yprev!=null){
		yprev.next=x;
	}
	
	Node temp=x.next;
	x.next=y.next;
	y.next=temp;
	
	if(k==1) {
		head=y;
	}
	if(k==n) {
		head=x;
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
	swap_k_start_and_end  s=new swap_k_start_and_end ();

	s.insert(1);
	s.insert(2);
	s.insert(3);
	s.insert(4);
	s.insert(5);
	s.insert(6);
	s.insert(7);
	s.insert(8);
	s.printlist();
	s.swap(2);
	s.printlist();
	
	
	
	
	
}
}
