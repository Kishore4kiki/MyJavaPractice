import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("(Use Full Names With small letters)");
        System.out.println("Which day did you have been Off:");
        Scanner dayOff = new Scanner(System.in);
        String value = dayOff.nextLine();

        if (value.equals("monday")) {
            System.out.println("You got your permission for monday");
        }

            else if (value.equals("tuesday")) {
                    System.out.println("You got your permission for tuesday");
                } else if (value.equals("wednesday")) {
                    System.out.println("You got your permission for wednesday");
                } else if (value.equals("thursday")) {
                    System.out.println("You got your permission for thursday");
                } else if (value.equals("friday")) {
                    System.out.println("You got your permission for friday");
                }

        else {
            System.out.println("It was a weekend so, no problem");
        }

    }
}

