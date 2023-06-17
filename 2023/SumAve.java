package Array;
public class SumAve {

    public static int sum(int[] a) {
    
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
    public static float avg(int[] a) {
        int sum=0;
        float avg = (float)1.0;
        for(int i=0; i<a.length; i++) {
            sum+=a[i];
        }
        avg = sum/a.length;
        return avg;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(sum(a));
        System.out.println(avg(a));
    }   
}
