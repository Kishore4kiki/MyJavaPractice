package Array;

public class AscendingOrder {
	public static void main(String[] args) {
		int[] arr ={5,4,2,6,1};
		int a = arr.length;
        int temp=0;

        for (int i = 0; i < a; i++){
            for (int j = i;j<a;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }   
        }

		for(int i : arr){
		    System.out.print(i+" ");
		}        
	}
}
