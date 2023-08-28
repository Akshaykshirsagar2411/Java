
interface Core2web{
    
    String lang(int num);
}
public class Lambda1 {

    public static void main(String[] args) {
        
        Core2web c2w =  (xyz)->{
     
            return "Akshay";
        };

        System.out.println(c2w.lang(2));
    }
    
}
