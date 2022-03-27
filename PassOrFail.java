import java.util.Scanner;
import java.util.Random;

public class PassOrFail {
    public static void main(String[] args) {

        System.out.print("Enter Your Roll No (01-50) : 1822JB");
        Scanner input1 = new Scanner(System.in);
        int roll = input1.nextInt();

        Random input2 = new Random();
        int  mark = 20 + input2.nextInt(80);


        System.out.println("Roll No : 1822JB" + roll);
        System.out.println("You have got : " + mark + "/100");
        if (mark>=40){
            System.out.println("Congratulation, You are Passed");
        }else{
            System.out.println("Better Luck Next Time, Failed");
        }



    }
}
