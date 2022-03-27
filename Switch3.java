import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        System.out.println("Enter an Alphabet (Capital): ");
        Scanner input1 = new Scanner(System.in);
        char str = input1.next().charAt(0);

        switch (str) {
            case 'A' , 'E' , 'I' , 'O' , 'U' :
                System.out.println(str + " is an Vowel");
                break;
            default:
                System.out.println(str + " is an Consonant");
        }
    }
}
