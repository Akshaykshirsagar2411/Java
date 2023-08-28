 import java.util.*;
 class ArraList1{

   
    public static void main(String[] args) {
         ArrayList al = new ArrayList();

    al.add("kanha");
    al.add("Rahul");
    al.add("Ashish");

   System.out.println(al);

   Iterator itr = al.iterator();

    while(itr.hasNext()){
        if("Rahul".equals(itr.next())){
            itr.remove();
        }
    }
    
    System.out.println(al);
   
    while(itr.hasNext()){

        System.out.println(itr.next());
    }
    }
}
