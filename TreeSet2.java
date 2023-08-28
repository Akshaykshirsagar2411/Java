import java.util.*;
import java.io.*;
class Democlass implements Comparable{

    String str =null;

    Democlass(String st){
        this.str=str;
    }

    public int compareTo(Democlass obj){

        (obj.str).compareTo(this.str);

        return -1;
    }

    public String toString(){
        return str;
    }

}

class TreeSet2 {

    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();


         ts.add(new Democlass("kanaha"));
         ts.add(new Democlass("Ashish"));
         ts.add(new Democlass("rahul"));

    }
}
