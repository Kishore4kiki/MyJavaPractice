import java.util.Scanner;

public class PyramidOfStars {
    public static void main(String[] args) {

        int i,j;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number to print Pyramid rows : ");
        int rows = input1.nextInt();

        for(i=1;i<=rows;i++){ // for printing rows

           for(j=i;j<rows;j++){ // to make spaces
               System.out.print(" ");
           }

           for (j=1;j<=(2*i-1);j++){ // to print stars
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
