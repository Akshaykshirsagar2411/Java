import java.util.*;
class Array6 {
    

    public static void main(String[] args) {
        
        int arr[]=new int[]{2,4,6,10};

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0;i<arr.length;i++){

            for(int j=0;i<arr.length;j++){
              int x= arr[i];
               if(x+arr[j]==N){
               System.out.println(x+ " and "+ arr[j]);
               }
            }
        }

        
    }
}
