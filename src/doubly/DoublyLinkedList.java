package doubly;

import java.util.Scanner;

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
      Node newNode=new Node(data);
      if(tail==null){
          head=tail=newNode;
      }
      else{
          newNode.prev=tail;
          tail.next=newNode;
          tail=newNode;
      }


    }
    //at paticular position
    public void atPosition(int data){
        Scanner sc=new Scanner(System.in);
        int position=sc.nextInt();
        Node newNode=new Node(data);
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
        if(position==0){
            newNode.next = head;
            head = newNode;
            return;
        }






    }

}
