import java.util.Scanner;
//Using if in scanner
public class IfStatement {
    public static void main(String[] args) {

        System.out.print("Enter your age: ");
        Scanner value = new Scanner(System.in);
        int age = value.nextInt();

       /* if (age==18){
            System.out.println("\nYou Are Eligible For Certain Categories");
        }
        else if (age>18){
            System.out.println("\nYou Can Access Everything Here");
        }
        else{
            System.out.println("\nYou Are Not Eligible");
        }*/

        String age1 = (age>=18)? "You Can Access Everything Here" : "You Are Not Eligible";
        System.out.println(age1);



    }
}
