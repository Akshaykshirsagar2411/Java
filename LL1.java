class LL1{

    private ListNode head;

     static class ListNode{


        private int data;
        private ListNode next;

        ListNode(int data){

            this.data=data;
            this.next= null;

        }
    }

     void display(){

        ListNode current = head;
        while(current != null){
         System.out.print(current.data + "-->");
         current=current.next;
        }
        {
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        
        LL1 ll = new LL1();

        ll.head= new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        ll.head.next= second;
        second.next=third;
        third.next=fourth;

        ll.display();
    }
}