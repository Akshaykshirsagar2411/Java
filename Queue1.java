 import java.util.*;
 class Queue1 {

    public static void main(String[] args) {
    
        Queue que = new LinkedList();

        que.offer(10);
         que.offer(12);
          que.offer(13);
           que.offer(135);
            que.offer(107);
            
            System.out.println(que);

            que.poll();
            que.remove();

             System.out.println(que);
              System.out.println(que.peek());

               System.out.println(que.element());
                System.out.println(que);





    }
}
