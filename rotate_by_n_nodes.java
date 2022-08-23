package doubly;

public class rotate_by_n_nodes {
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
	newnode.next=head;
	if(head!=null) {
		head.prev=newnode;
	}
	newnode.prev=null;
	head=newnode;
}

void rotate(int k) {
	Node cur=head;
	int c=1;
	while(c<k && cur!=null) {
		cur=cur.next;
		c++;
	}
	Node nth=cur;
	while(cur.next!=null) {
		cur=cur.next;
	}
	cur.next=head;
	head.prev=cur;
	head=nth.next;
	head.prev=null;
	nth.next=null;
	
	
	
	
}

void printlist() {
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("NULL\n");
}

public static void main(String args[]) {
	rotate_by_n_nodes r=new rotate_by_n_nodes();
	r.push(5);
	r.push(4);
	r.push(3);
	r.push(2);
	r.push(1);
	r.printlist();
	r.rotate(2);
	r.printlist();
}
}
