package Array;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,45,12,76,45,23,3,12};

        System.out.println("The duplicats are ");
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    System.out.print(arr[i]+ " ");
                }
            }            
        }
    }
}
