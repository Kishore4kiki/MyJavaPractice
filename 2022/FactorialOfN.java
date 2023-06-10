import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        int i,n,f;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number to Factorial : ");
        n = input1.nextInt();

        i=1;
        f=1;
        do {
            f = f*i;
            i++;
        }while(i<=n);
        System.out.println("Factorial of First " + n  + " number is : " + f);
    }

}
