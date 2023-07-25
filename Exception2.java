//Arithmatic exception
//Arithmatic Exception


class Exception2 {
   
    
    void m1(){
        System.out.println(10/0);
        m2();
    }

    void m2(){
                System.out.println("In m2");
    }

public static void main(String[] args) {
    System.out.println("Start main");
    
    Exception2 obj = new Exception2();
    obj.m1();
}


}
