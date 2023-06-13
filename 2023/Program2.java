class Program2{
    public static void main(String[] args) {
        
        int[] arr = {4,3,7,11,50,1};
        int x = 1,y=50;

        if (x<y){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] > x && arr[i] < y ){
                    System.out.println(arr[i]);
                }
            }
        }
        else{
            System.out.println("Program will not execute correctly");
        }
    }
}