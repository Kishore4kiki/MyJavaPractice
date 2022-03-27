import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your salary: ");
            double salary = scanner.nextDouble();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Your Salary : \n\r" + salary);
            System.out.println("Your age : \n\r" + age);
    }
}









