public class SortArray {
    

    public static int removeDuplicates() {
         int nums[] = new int[]{1,2,2};
         for(int i=0;i<nums.length-1;i++){

        System.out.print(nums[i]);
    }
    System.out.println();
        int j=1;

    for(int i=0;i<nums.length-1;i++){

  //  System.out.print(arr[i]);

    if(nums[i]!=nums[i+1]){

   nums[j]=nums[i+1];
   j++;


    }

    }

    for(int i=0;i<nums.length-1;i++){

        System.out.print(nums[i]);
    }
    return j;
    
}
public static void main(String[] args) {
    
   
    removeDuplicates();
    
}

}
