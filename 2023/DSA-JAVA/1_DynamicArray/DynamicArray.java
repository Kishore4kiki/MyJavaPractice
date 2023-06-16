package ArrayDSA;
import java.util.*;

class Dynamic<LC>{ //LC - LooslyCoupling

	private static final int initialCapacity = 4;
	private LC arr[];
	private int size;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	Dynamic(){
		size = 0;
		capacity = initialCapacity;
		arr = (LC[]) new Object[initialCapacity];
	}
	public void insert(LC val) { //1
		if(size==capacity) 
			expand();
		arr[size++] = val;		
	}

	public void Display() { //2
		System.out.print("Values are ");
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " "); 		
	}
	
	public void InsertAt(int pos, LC val) { //3
		if(size==capacity) 
			expand();
		for(int i=size-1;i>=pos;i--)
			arr[i+1] = arr[i];
		arr[pos] = val;
		size++;
	}
	
	public void insertAtFrst(LC val) { //4
		
		for(int i=size-1;i>=0;i--) 
			arr[i+1] = arr[i]; 
		arr[0] = val;
		size++;
	}
	
	
	public void DeleteAt(int pos) { //5
		
		if(size==capacity && capacity <= 3*size) 
			shrink();
		
		for(int i=pos+1;i<=size;i++)
			arr[i-1] = arr[i];
		size--;
		
	}
	
	public void DeleteAtEnd() { //6
		
		--size;
		
	}
	
	
	public void DeleteAtFrst() { //7
		
		for(int i=1;i<=size-1;i++) {
			arr[i-1] = arr[i];
		}
		size--;
		  
	}
	
	public int searchVal(LC val) { //8
		for(int i=0;i<size;i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		return -1;
	}
	
	public void getIndex(int index) { //9
		
		System.out.print("The value is " + arr[index]);
		
	}
	
	public void update(int pos, LC val) { //10

		arr[pos] = val;
		
	}
	
	public boolean contains(LC val) {
		for(int i=0;i<size;i++) {
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}
	
	public void clear() { //12
		size = 0;
	}
	
	private void expand() {
		capacity *= 2;
		arr = java.util.Arrays.copyOf(arr,capacity);
		
	}
	
	private void shrink() {
		capacity /= 2;
		arr = java.util.Arrays.copyOf(arr,capacity);
	}
		
}


public class DynamicArray {

	public static void main(String[] args) {

		int pos,val;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
		Dynamic<Integer> obj = new Dynamic<Integer>();
		while(true) {
			System.out.print("\n -------- List Menu -----------\n");
	        System.out.print("1. Insert at End\n");
	        System.out.print("2. Display the list\n");
	        System.out.print("3. Insert at specified position \n");
	        System.out.print("4. Insert from Beginning \n");
	        System.out.print("5. Delete from specified position\n");
	        System.out.print("6. Delete at end\n");
	        System.out.print("7. Delete from beginning\n");
	        System.out.print("8. Search the index\n");
	        System.out.print("9. Get the value\n");
	        System.out.print("10.Update\n");
	        System.out.print("11.Contains\n");
	        System.out.print("12.Clear\n");
	        System.out.print("13.Exit\n");
	        System.out.print("\n--------------------------------------\n");
	        System.out.print("Enter your choice:");
	        
	        int choice = scan.nextInt();
	        
	        switch(choice) {
	        
	        case 1:
	        	System.out.print("Enter the value: ");
	        	val = scan.nextInt();
	        	obj.insert(val);
	        	break;
	        	
	        case 2:
	        	obj.Display();
	        	break;
	        	
	        case 3:
	        	System.out.print("Enter the position: ");
	        	pos = scan.nextInt();
	        	System.out.print("Enter the value: ");
	        	val = scan.nextInt();
	        	obj.InsertAt(pos,val);
	        	break;
	        	
	        case 4:
	        	System.out.print("Enter the value: ");
	        	val = scan.nextInt();
	        	obj.insertAtFrst(val);
	        	break;
	        	
	        case 5:
	        	System.out.print("Enter the position: ");
	        	pos = scan.nextInt();
	        	obj.DeleteAt(pos);
	        	break;
	        	
	        case 6:
	        	
	        	obj.DeleteAtEnd();
	        	break;
	        	
	        case 7:
	        	obj.DeleteAtFrst();
	        	break;
	        	
	        case 8:
	        	System.out.print("Enter the value to Search the index ");
	        	val = scan.nextInt();
	        	System.out.println(obj.searchVal(val)); 
	        	break;
	        	
	        case 9: 
	        	System.out.print("Enter the index to get the value: ");
	        	val = scan.nextInt();
	        	obj.getIndex(val);
	        	break;
	        	
	        case 10:
	        	System.out.print("Enter the position: ");
	        	pos = scan.nextInt();
	        	System.out.print("Enter the value: ");
	        	val = scan.nextInt();
	        	obj.update(pos,val);
	        	break;
	        	
	        case 11:
	        	System.out.print("Enter the value: ");
	        	val = scan.nextInt();
	        	System.out.println(obj.contains(val)); 
	        	break;
	        	
	        case 12:
	        	obj.clear();
	        	break;
	        	
	        case 13:
	        	System.exit(0);
	        	break;
	        	
	        default:
	        	System.out.print("Wrong Entry");
	        }
	        
		}	
	}

}
