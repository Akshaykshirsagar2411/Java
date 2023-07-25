class Demo{

    void marry(){
        System.out.println("kirti sonon");

    }
}


class Anno1 {
    public static void main(String[] args) {
        Demo obj = new Demo(){

            void marry(){
                System.out.println("disha patani");
            }
        };
        obj.marry();
    }
}
