package CloudCoder;

import java.util.Scanner;

public class AreaOfCircle {
    
    static int circle(int r){
        int area; //pi*r2;
    
        int pi = 22 / 7;
        area = (int) Math.sqrt(pi * r * r);
    
        return area;
    }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println();
        int radius = scan.nextInt();
        
        AreaOfCircle.circle(radius);
        
       }
}
