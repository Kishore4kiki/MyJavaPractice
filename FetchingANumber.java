import java.util.Scanner;

public class FetchingANumber {
    public static void main(String[] args) {
        int num,rem,sum=0;
        System.out.println("Enter a two digit Number : ");
        Scanner input1 = new Scanner(System.in);
        num = input1.nextInt();

        while(num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }

        System.out.println(sum);
    }
}
