


class Paltform implements comparable{

    String str=null;
    int foundYear = 0;

    Paltform(String str, int foundYear){

        this.str=str;
        this.foundYear=foundYear;

    }

    public int compareTo(object obj){
        
         return this.foundYear-((Paltform).obj).foundYear;
    }
}
class TreeMap2 {
    

    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap();

        tm.put(new Paltform("youtube",2016),"google");
        tm.put(new Paltform("Instagram",2010) ,"Meta");
        tm.put()
    }
}
