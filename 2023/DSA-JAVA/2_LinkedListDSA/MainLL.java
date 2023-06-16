package LinkedListDSA;

public class MainLL {

	public static void main(String[] args) {
		
		BackEndLL<Integer> obj = new BackEndLL<Integer>();
		
		obj.insertAtBeginning(5); //1
		obj.insertAtBeginning(7);
		obj.insertAtBeginning(2);
		obj.insertAtBeginning(4);
		obj.insertAtBeginning(9);
		obj.display();
		
		System.out.println();
		obj.insertAtPos(2,9); //2
		obj.display();
		
		System.out.println();
		obj.deleteAtPos(2); //3
		obj.display();
		
		System.out.println();
		obj.deleteAtBeginning(); //4
		obj.display();
		
		System.out.println();
		obj.get(3); //5
		
		System.out.println();
		obj.update(2,8); //6
		obj.display();
		
		System.out.println();
		obj.deleteAtEnd();//7
		obj.display();
		
		System.out.println();
		obj.insertAtEnd(6);//8
		obj.display();
		
		System.out.println();
		System.out.print("index is: " + obj.search(6));//9
		
		System.out.println();
		System.out.print("Contains: " + obj.contains(9));
		
		System.out.println();
		obj.length();
	}
}







