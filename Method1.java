class Outer {

    void m1(){

        System.out.println("in method");

        class Inner{

            void m2(){
                System.out.println("In Inner class");
            }

        }

    }
    //System.out.println("in outer class");
    
}

class Method1{

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.m1();

    
        
    }
}
