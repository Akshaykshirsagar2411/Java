class Demo extends Thread{

    public void run(){

        for(int i=0;i<10;i++){

            System.out.println("In run");

            try{

                Thread.sleep(1000);
            }catch(Exception ie){
             
            }
        }
    }
} 
 
 
 class Multi2 {

   public static void main(String[] args) {

     Demo obj = new Demo();

    obj.start();

    for(int i=0;i<10;i++){

        System.out.println("In main");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }
    }
   }
}
