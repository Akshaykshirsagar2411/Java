class LL3{

    void m1(){


       try{
         System.out.println(10/0);
       }catch(ArithmeticException ae){
        System.out.println("cannot divide by 0");
       }

       System.out.println(10/2);
    }
    public static void main(String[] args) {
        
        LL3 obj = new LL3();
        obj.m1();
    

    }
}