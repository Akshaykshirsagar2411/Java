 class Exception5 {

    
     void m1(){
        System.out.println("in m1");
     }
     void m2(){
        System.out.println("in m2");
     }

     public static void main(String[] args) {
        System.out.println("Start main");

        Exception5 obj = new Exception5();
        obj.m1();
        obj = null;
        obj.m2();
        System.out.println("End main");
     }
}
