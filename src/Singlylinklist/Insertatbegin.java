package Singlylinklist;

public class Insertatbegin {
    //insertion at the begning


    Node head=null;
    public void insertatbegin(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head.next;
        head=newNode;
    }
    //insert at last



}
