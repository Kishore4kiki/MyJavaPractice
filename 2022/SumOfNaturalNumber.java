import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {

        int i,n,s;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a number to sum : ");
        n = input1.nextInt();

        i=1;
        s=0;
        while(i<=n){
            s = s+i;
            i++;
        }
        System.out.println("Sum of the First " + n  + " natural number is : " + s);
    }

}
