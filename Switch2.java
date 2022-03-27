import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        System.out.println("Enter a number to see the day : ");
        Scanner input1 = new Scanner(System.in);
        int  num = input1.nextInt();

        switch (num){
            case 1 :
                System.out.println("It's Sunday");
                break;
            case 2 :
                System.out.println("It's Monday");
                break;
            case 3 :
                System.out.println("It's Tuesday");
                break;
            case 4 :
                System.out.println("It's Wednesday");
                break;
            case 5 :
                System.out.println("It's Thursday");
                break;
            case 6 :
                System.out.println("It's Friday");
                break;
            case 7 :
                System.out.println("It's Saturday");
                break;
        }

    }
}
