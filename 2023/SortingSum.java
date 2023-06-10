public class SortingSum{
    public static void main(String[] args) {
        int[] num = {0,5,6,0,9,0,1,4};

        int length = num.length;
        int sum=0,big=0;

        for (int i = 0; i < length-1; i++){
                sum = num[i]+num[i+1];
                if(big<sum){
                    big = sum;
                }
            }
            System.out.println(big);

    }
}