import java.util.*;

class Cricket{

    int no =0;
    String str = null;

    Cricket(int no,String str){

        this.no=no;
        this.str= str;
        
    }

    public String toString(){

        return no +":"+str;
    }
}


class HashSet1 {
    
    public static void main(String[] args) {
        
        HashSet hs = new LinkedHashSet();

     hs.add(new Cricket(7,"virat"));
     hs.add(new Cricket(9,"rohit"));

     System.out.println(hs);
    }
}
