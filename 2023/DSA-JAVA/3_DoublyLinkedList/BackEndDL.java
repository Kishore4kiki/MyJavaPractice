package DoublyLinkedList;

public class BackEndDL<LC> {

	Node head;
	Node tail;
	class Node{
		LC data;
		Node next;
		Node prev;
			Node(LC val){
				data = val;
			}
	}

	BackEndDL(){
		head = null;
		tail = null;
	}

	public void insertAtBeginning(LC val) { //1
		Node newNode = new Node(val);
		
		if(head==null) {
			tail = newNode;
		}
		else {
			head.prev = newNode;
			newNode.next = head;
		}
		head = newNode;
	}

	public void display() { //2

		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void displayRev() { //3

		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
	}
	
	public void insertAtEnd(LC val) {		//4
		
		Node newNode = new Node(val);
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	public void insertAtPos(int pos,LC val) { //5
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
			Node newNode = new Node(val);
			Node temp = head;
			for(int i=1;i<pos;i++) {
				temp = temp.next;
				if(temp.next==null) {
					insertAtEnd(val);
					return;
				}
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.prev = temp;
			temp.next.prev = newNode;
	}
	
	public void deleteAtBeginning() { //6
		if(head==null)
			throw new IndexOutOfBoundsException();
		else
			head=head.next;
			if(head==null)
				tail = null;
			else
				head.prev=null;
			return;
	}
	
	public void deleteAtEnd() { //7
		if(tail==null) {
			throw new IndexOutOfBoundsException();
		}
		else if(tail.prev==null) {
			tail = null;
			head = null;
		}
		else {
			tail.prev.next = null;
			tail = tail.prev;
		}
}
	
	public void deleteAtPos(int pos) { //8
		if(pos==0) {
			deleteAtBeginning();
			return;
		}
		
		Node current = head;
		Node temp = null;
		
		for(int i=1;i<=pos;i++) {
			temp = current;
			current = current.next;
			if(current.next==null) {
				deleteAtEnd();
				return;
			}
		}
		temp.next = current.next;
		if(current.next==null) 
			tail = temp;
		else
		current.next.prev =  temp;
	}

	public void get(int pos) { //9
		if(pos==0) {
			System.out.print(head.data);
			return;
		}
		Node temp = head;
		for(int i=1;i<=pos;i++) {
			temp = temp.next;
			if(temp==null) {
				throw new NullPointerException("Null");
			}
		}
		System.out.print(temp.data);
		
	}

	public void update(int pos, LC val) { //10
		Node temp = head;
		for(int i=1;i<=pos;i++) {
			temp = temp.next;
		}
		temp.data=val;
		
	}

	public int search(LC val) { //11
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
	
	public boolean contains(LC val) { //12
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data==val) { 
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void length() { //13
		int i=0;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			i++;
		}
		
		System.out.print(i);
	}
}








