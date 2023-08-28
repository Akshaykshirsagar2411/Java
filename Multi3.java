
class Demo2 extends Thread{


    public void run(){

         System.out.println("In run2");

       
         System.out.println(Thread.currentThread().getName());
    }
}

class Demo1 extends Thread{

    public void run(){

         System.out.println("In run1");

       
         System.out.println(Thread.currentThread().getName());

         Demo2 obj1= new Demo2();
         obj1.start();

    }

    // public void start(){S
    //      System.out.println("In Demo start");
    //      run();
    // }

    
} 
 
 
 class Multi3 {

   public static void main(String[] args) {

     Demo1 obj = new Demo1();

    obj.start();

    

    System.out.println(Thread.currentThread().getName());
   }
}
