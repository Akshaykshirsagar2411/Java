import java.util.*;
import java.io.*;
class Myclass implements Comparable<Myclass>{

    String str =null;

    Myclass(String str){
        this.str=str;
    }

    public int compareTo(Myclass obj){

        (obj.str).compareTo(this.str);

        return 1;
    }

    public String toString(){
        return str;
    }

}

class TreeSet1 {

    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();


         ts.add(new Myclass("kanaha"));
         ts.add(new Myclass("Ashish"));
         ts.add(new Myclass("rahul"));

         System.out.println(ts);

    }
}
