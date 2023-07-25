class Outer1{

    class Inner{

    void fun1(){
        System.out.println("fun1-inner");
    }
    }

    void fun2(){
        System.out.println("In fun2-outer");
    }

    

}

class Client{

        public static void main(String[] args) {
            Outer1 obj = new Outer1();
            obj.fun2();
        }
    }