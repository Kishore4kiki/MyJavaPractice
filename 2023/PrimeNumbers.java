package Array;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
              
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter a number to print prime numbers: ");
        int num = scan.nextInt();

        int[] arr = new int[num];
        int prime=0;

        System.out.println("The Prime Numbers are ");
            for (int i=2; i<=num; i++) {
                int count=0;
                for (int j=2; j<i; j++) {
                    if(i%j==0){
                        count++;
                    }
                    }
                    if(count==0){
                        arr[prime]=i;
                        prime++;
                        //System.out.println(i+" ");
                    }
            }

            for(int i=0;i<prime;i++){
                System.out.print(arr[i] + ", ");
            }
        }
}