import java.util.Scanner;

class TDarray1{


    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter array lenth");
        int m = sc.nextInt();
        int n = sc.nextInt();

        
        int arr [][] = new int[m][n];
    System.out.println("Enter array Element");
        for(int i=0;i<m;i++){

        for(int j=0;j<n;j++){

            arr[i][j]= sc.nextInt();
        }
        }

System.out.println("Display array elemnt ");
        for(int i=0;i<m;i++){

        for(int j=0;j<n;j++){

            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
        }
    }
} 