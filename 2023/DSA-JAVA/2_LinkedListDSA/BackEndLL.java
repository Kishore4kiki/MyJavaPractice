package LinkedListDSA;

public class BackEndLL<LC> {

	Node head;
	class Node{
		LC data;
		Node next;
			Node(LC val){
				data = val;
			}
	}

	BackEndLL(){
		head = null;
	}

	public void insertAtBeginning(LC val) { //1
		
		Node newNode = new Node(val);
		if(head==null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() { //2

		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void insertAtPos(int pos,LC val) { //3
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
			Node newNode = new Node(val);
			Node temp = head;
			for(int i=1;i<pos;i++) {
				temp = temp.next;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
	}
	
	
	public void deleteAtBeginning() { //4
		if(head==null)
			throw new IndexOutOfBoundsException();
		else
			head=head.next;
			return;
	}
	
	public void deleteAtPos(int pos) { //5
		if(pos==0) {
			head=head.next;
		}
		
		Node temp = head;
		Node prev = null;
		
		for(int i=1;i<=pos;i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	public void get(int pos) { //6
		if(pos==0) {
			System.out.print(head.data);
			return;
		}
		
		Node temp = head;
		for(int i=1;i<=pos;i++) {
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
	public void update(int pos,LC val) { //7
		Node temp = head;
		for(int i=1;i<=pos;i++) {
			temp = temp.next;
		}
		temp.data=val;
	}

	public void deleteAtEnd() { //8
			if(head==null) {
					return;
				}
			
			else if(head.next==null) {
					head = null;
				}
			
			else {
				Node prev = head;
				
				while(prev.next.next!=null) {
					prev = prev.next;
				}
				prev.next = null;
			}
	}

	public void insertAtEnd(LC val) {		//9
		
		Node newNode = new Node(val);
		Node temp = head;
		if(head==null) {
			head = newNode;
			return;
		}
		else {
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = null;
		}
	}
	
	public int search(LC val) { 	//10
		
		Node temp = head;
		int i=0;
		while(temp!=null) {
			if(temp.data==val) { 
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;
	}

	public boolean contains(LC val) { //11
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data==val) { 
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void length() { //12
		int i=0;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			i++;
		}
		
		System.out.print(i);
	}
	
	public void reverse() { //13
		
		if(head==null) {
			head = null;
			return;
		}
		else if(head.next==null) {
			head.next = null;
			return;
		}
		else {
			Node prev = null;
			Node current = head;
			Node next = head.next;
			
			while(current!=null) {
				   next = current.next;
				   current.next = prev;
				   prev = current;
				   current = next;
			}
			
			head = prev;
		}
	}
	
	
	
	
}








