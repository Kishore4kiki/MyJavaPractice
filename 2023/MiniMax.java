package Array;

import java.util.Scanner;

public class MiniMax {
    //To print maximum and minimum number from an array.
    public static int maxi(int[] a){
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int[] a){
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many arrays you are going to enter : ");
        int count = scan.nextInt();

        int[] a = new int[count];
        
        System.out.print("Enter the values: ");
        for (int i = 0; i < count; i++){
            a[i] = scan.nextInt();
        }


        //int[] a = {2, 34562, 454, -47, 6};
        System.out.println("The Maximum number is "+maxi(a));
        System.out.println("The Minimum number is "+min(a));
    }
}

