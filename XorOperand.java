public class XorOperand {
    public static void main(String[] args) {
        int a = 5;
        int b = 3 ;
        int a1,b1;

        a = (a^b)^b;
        b = (a^b)^a;

        a1 = (a^b)^a;
        b1 = (a^b)^b;


        System.out.println("A is " + a);
        System.out.println("B is " + b);
        System.out.println("Swapped A is " + a1);
        System.out.println("Swapped B is " + b1);
    }
}
