package DoublyLinkedList;

public class MainDL {

	public static void main(String[] args) {
		
		BackEndDL<Integer> obj = new BackEndDL<Integer>();
		
		obj.insertAtBeginning(5); //1
		obj.insertAtBeginning(7);
		obj.insertAtBeginning(2);
		obj.insertAtBeginning(4);
		obj.insertAtBeginning(9);
		obj.display(); //2
		System.out.println(); 
		obj.displayRev(); //3
		
		System.out.println();
		obj.insertAtEnd(6);//4
		obj.display();
		
		System.out.println();
		obj.insertAtPos(7,1); //5
		obj.display();
	
	    System.out.println();
		obj.deleteAtPos(2); //6
		obj.display();
		
		System.out.println();
		obj.deleteAtBeginning(); //7
		obj.display();
		
		System.out.println();
		obj.deleteAtEnd();//8
		obj.display();
		
		System.out.println();
		obj.get(1); //9
	
		System.out.println();
		obj.update(0,8); //10
		obj.display();
		
		System.out.println();
		System.out.print("index is: " + obj.search(6));//11
	
		System.out.println();
		System.out.print("Contains: " + obj.contains(9));//12
		
		System.out.println();
		obj.length(); //13
	}
}







