import java.util.*;
import java.util.concurrent.*;
class PBqueue1 {

    public static void main(String[] args) throws InterruptedException{
        
        BlockingQueue bq = new PriorityBlockingQueue(4);

         bq.put(10);
         bq.put(20);
         bq.put(30);
  bq.put(10);
         bq.put(20);
         bq.put(30);
  bq.put(10);
         bq.put(20);
         bq.put(30);
  bq.put(10);
         bq.put(20);
         bq.put(30);

      
         bq.put(49);

            System.out.println(bq);

               
            //     javap -c java.util.concurrent.PriorityBlockingQueue   
    }
}
