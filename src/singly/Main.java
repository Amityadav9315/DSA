package singly;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(); // Use your custom LinkedList class
        linkedList.insertAtBeginning(12);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtEnd(34);
        // Correct method name
        linkedList.printData();                  // Print the linked list
    }
}
