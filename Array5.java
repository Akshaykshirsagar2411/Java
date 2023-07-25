import java.util.Scanner;

class Array5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("Enter array size");

   int N = sc.nextInt();

   int arr[] = new int[N];
   System.out.println("Enter Array element");

   for(int i=0;i<arr.length;i++){

   arr[i]= sc.nextInt();

   }

   System.out.println("Enter the v");

   for(int i=0;i<arr.length;i++){
    
      int x=arr[i];
    int count =0;

    if(arr[i]==-1){
        continue;
    }
    for(int j=0;j<arr.length;j++){

          if(arr[j]==x){

            count++;
            arr[j]=-1;
          }

          
    }
    System.out.println("Frequencies of number "+ x + " = " + count);

   }
    }


}


