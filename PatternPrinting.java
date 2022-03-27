import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int row = input1.nextInt();

        int i,j;

        for (i=1;i<=row;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
