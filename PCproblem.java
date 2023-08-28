import java.util.concurrent.*;
import java.util.*;

class Procduer implements Runnable{

    BlockingQueue BQ=null;

    Procduer(BlockingDeque BQ){

        this.BQ=BQ;
    }

    public void run(){
        for(int i=0;i<10;i++){

            try{
                BQ.put(i);
                System.out.println("poduce"+i);
            }catch(InterruptedException ie){

            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
               
            }
        }
    }

} 

class Consumer implements Runnable{

    BlockingQueue BQ=null;
    Consumer(BlockingDeque BQ){

        this.BQ=BQ;
    }

    public void run(){
        for(int i=0;i<10;i++){

            try{
                BQ.take();
                System.out.println("consume"+i);
            }catch(InterruptedException ie){

            }
             try {
                Thread.sleep(7000);
            } catch (InterruptedException ie) {
               
            }
        }
    }

} 
 
 
 
 
class PCproblem{
    public static void main(String[] args) {
        
    BlockingQueue BQ = new BlockingQueue<E>(4) {
        
    };

    

    Procduer pd = new Procduer(BQ);
    Consumer cd = new Consumer(BQ);

    Thread pdThread = new Thread(pd);
    Thread cdThread = new Thread(cd);

    pdThread.start();
    cdThread.start();

    }
}
