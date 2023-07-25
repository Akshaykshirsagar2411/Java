class Exception4 {

    void m1(){
        System.out.println(10/0);
        m2();
    }

    void m2(){
        System.out.println("in m2");
    }

    public static void main(String[] args) {
        Exception4 obj = new Exception4();
        obj.m1();
    }

}
