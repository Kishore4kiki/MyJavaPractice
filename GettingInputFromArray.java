import java.util.Scanner;

public class GettingInputFromArray {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the length of the arrays : ");
        int size = input1.nextInt();

        //assigning inputted value to an array
        int[] array = new int [size];

        //entering the values into loops
        for (int i=0;i<size;i++){
            System.out.print("Enter Array Numbers : ");
            array[i] = input1.nextInt();
        }
        input1.close();

        System.out.println("\n" + "****** The Entered Array Values are ******");
        for (int i=0;i<array.length;i++){
            System.out.println("\t\t" + array[i]);
        }
    }
}
