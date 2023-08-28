 import java.util.*;
 class Stream1 {

    public static void main(String[] args) {
        
        Stream sm = new Stream();

    ListIterator litr = sm.ListIterator();

    while(litr.hasNext()){

        System.out.println(litr.next());
    }
    }
}
