package doubly;

public class DoublyLinkedList {

    private Node head;
    private Node tail;


    public DoublyLinkedList(){
        head=null;
        tail=null;
    }

    //add the data to front
    public  void addFront(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }


    }


    //add data to end
    public void addEnd(int data){

    }

}
