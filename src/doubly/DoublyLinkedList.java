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
            newNode = head;
            newNode.next=head.prev;
            head=newNode;
        }

    }

    //delete front

    public void deleteFront(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    //delete from end
    public void deleteEnd(){

        if(tail==null){
            System.out.println("List is empty");
            return;
        }
        if(tail.prev==null){
            head=tail=null;

        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }

    //display backward
    public void displayBackward(){
        Node current=tail;
        while(current!=null){
            System.out.print(current.data + "\t");
            current=current.prev;
        }

    }
    //display forward
    public void displayForward(){

    }


}
