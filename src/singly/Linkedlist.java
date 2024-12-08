package singly;


public class LinkedList {

    static Node head = null;

    // Insert at the beginning
    public void insertAtBeginning(int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at a specific position
    public void insertAtSpecific(int item, int position) {
        Node newNode = new Node(item);
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int index = 0;
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            System.out.println("Position out of bound");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the linked list
    public static void printData() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }

    }

    //delete at begninning
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;

    }

    //delete from last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty no nodes to delete");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }


        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;


        temp.next = null;


    }

    //delete from specific position
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null || temp.next == null) {
            System.out.println("Position is out of bound");
            return;
        }
        temp.next = temp.next.next;


    }

    //for searching data
    public boolean searchData(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data)
                return true;
            temp=temp.next;

        }
        return false;
    }

    public void insertAtPosition(int data, int position) {
    }
}
