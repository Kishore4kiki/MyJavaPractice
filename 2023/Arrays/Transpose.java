package Array;

public class Transpose {
    public static void main(String[] args) {
        
        int[][] a = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("The Given matrix is " );
        for(int i = 0; i < a[0].length; i++){
            for(int j = 0; j < a[0].length;j++){
                System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
        System.out.println("The Transpose matrix is " );
        for(int k = 0; k < a[0].length; k++){
            for(int j = 0; j < a[0].length;j++){
                System.out.print(a[j][k] + " ");
        }
        System.out.println();
    }
    
    }
}
