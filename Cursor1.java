import java.util.*;
class Cursor1 {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20.5f);
        al.add(30.5f);
        al.add("c2w");
        al.add("kanha");
        System.out.println(al);


        for( var x:al){
            System.out.println(x.getClass().getName());
        }

        Iterator curso =  al.iterator();

        while(curso.hasNext()){
            if("kanha".equals(curso.next())){
                curso.remove();
            }
        }

        System.out.println(al);

        curso.next();
    }
    

}
