 class test {
    
    public static void main(String[] args) {
        int N = 1001;
        int Temp=N;

        int rev = 0;

        while(N !=0){
        int rem = N%10;

         rev = rev*10+rem;
         N= N/10;
        }

        if(rev==Temp){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
