 class Test4 {




   static int  Sortarr( int arr[]){
            
            for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){
                    int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
    
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i] + " ");
        }

        return 0;

        }

    public static void main(String[] args) {
        
        int arr1[]= {1,5,3,6,2,8};

        
       Sortarr(arr1);
     

        
    }

}
