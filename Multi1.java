import java.util.*;


class Client implements Runnable{

    public void run(){

      for(int i=0;i<10;i++){
          System.out.println("In run");
      }
      

      
    }
}

class Multi1{

    public static void main(String args[]){
  
        Client obj = new Client();

        Thread t = new Thread(obj);
          

        t.start();

        Client obj2 = new Client();

        Thread t2 = new Thread(obj2);

        t2.start();

       


          


       
       

        
    }
}