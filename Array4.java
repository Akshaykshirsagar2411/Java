
import java.util.*; 
class Array4 {
    


    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter array size");

   int N = sc.nextInt();

   int arr[] = new int[N];
   System.out.println("Enter Array element");

   for(int i=0;i<arr.length;i++){

   arr[i]= sc.nextInt();

   }
  int sum =0;
   for(int i= 0;i<arr.length;i++){
    
     sum =sum + arr[i];
   }

   System.out.println("Array sum="+ sum);

int count=1;
for(int i= 0;i<arr.length;i++){
    
     for(int j=0;j<arr.length;j++){

        if(arr[i]==arr[j]){
            count++;
        }

        
     }
   System.out.println("Frequncies of"+arr[i] + count);
   }
  



}






    
}

