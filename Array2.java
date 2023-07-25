import java.util.*;

public class Array2 {
  
    
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter array size");

   int N = sc.nextInt();

   int arr[] = new int[N];
   System.out.println("Enter Array element");

   for(int i=0;i<arr.length;i++){

   arr[i]= sc.nextInt();

   }

System.out.println("Print array element");
   for(int i=0;i<arr.length;i++){

 System.out.println(arr[i]);

   }

   

   


    }
}
