class Outer{
    

    class Inner{
        void fun(){
        System.out.println("In-fun-inner");
    }
    }

    void fun2(){
        System.out.println("In-fun2-outer");
    }
}

class Client2 {
    public static void main(String[] args) {
        
        Outer obj = new Outer();
        obj.fun2();

        Outer.Inner obj1 = obj.new Inner();
        obj1.fun();

        Outer.Inner obj2 = new Outer().new Inner();

        obj2.fun();
    }
}
