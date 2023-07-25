import java.util.Scanner;

class BusCapacityException extends RuntimeException{

 BusCapacityException( String msg){
         super(msg);
    }
}




class Myexception1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of operations");
    System.out.println("limit of passengers i 50");
    int passengers = sc.nextInt();

    if(passengers >50){
        throw new BusCapacityException("bus limit is upto 50 passengers only");

    }

    
    }
}
