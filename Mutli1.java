import java.util.*;


class Client implements Runnable{

    public void run(){

        System.out.println("In run");
    }
}

class Mutli{

    public static void main(String args[]){
  
        Client obj = new Client();

        Thread t = new Thread(obj);

        t.start();

        
    }
}