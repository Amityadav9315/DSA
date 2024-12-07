package Singlylinklist;

public class Insertatbegin {

    Node head=null;

    //insertion at begning
    public  void insertAtBegninning(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head.next;
        head=newNode;
   }
    //insert at last

    public void insertAtEnd(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;

        }
        //important
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;
    }
    //insert at specific position
    public void insertAtSpecific(int item,int position) {
        Node newNode = new Node(item);
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }
        Node temp = head;
        int index = 0;
        while (temp.next != null) {
            temp = temp.next;
            index++;
            if (index == position - 1) {
                break;

            }
            if (temp == null) {


                System.out.println("Position out of bound");
                return;

            }
            //insert
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
            public  void printData(){
             Node temp=head;
             while(temp==null){
                 System.out.println(temp.data);
                 temp=temp.next;
             }



        }

}