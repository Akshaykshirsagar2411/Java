 import java.util.*;
 
 class Array3 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the size of array");

         int N = sc.nextInt();

         int arr[] = new int[N];
           System.out.println("Enter the element in array");

         for(int i= 0;i<arr.length;i++){

            arr[i] = sc.nextInt();
         }
       
         System.out.println("Even numbers of array");

         for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }

             
         }
           System.out.println("Max numbers of array");
           int max=0;

               for(int i=0;i<arr.length;i++){
                
                if(arr[i]>max){

                    max = arr[i];
                
                }



               }
               System.out.println("Max Element="+ max);


               System.out.println("Min umbers of array");
           int min =0;

               for(int i=0;i<arr.length;i++){
                
                if(arr[i]<max){

                    min = arr[i];
                    max = arr[i];
                
                }



               }
                 System.out.println("Min numbers of array="+ min);
         
               

    }


}
