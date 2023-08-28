 class Test2 {
    

    public static void main(String[] args) {

        int arr[] = new int[]{4,2,5,6,7};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){

                       if(max<arr[i]){

                        max=arr[i];
                       }
        }

        System.out.println("max number is "+ max);
    }
}
