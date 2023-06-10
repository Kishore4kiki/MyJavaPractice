import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        int i,n;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter to see odd number upto : ");
        n = input1.nextInt();

        for( i=1 ; i<=n; i = i+2 ){
            System.out.println(i);
        }

    }
}
