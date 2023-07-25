class Outer {
    
    static class Inner{
        void m1(){
            System.out.println("in method m1");
        }

    }
    
}

class StaticInner{
    public static void main(String[] args) {
        Outer.Inner obj1 = new Outer.Inner();

        obj1.m1();
    }
}
