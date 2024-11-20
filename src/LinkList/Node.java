package LinkList;

public class Node {

    // Instance variable for storing data
    private int data;

    // Pointer to the next node in the list
    public Node next;

    // Constructor to initialize data and optionally set the next node
    public Node(int data) {
        this.data = data;
        this.next = null;  // Set next to null by default
    }

    // Main method to test the Node class
    public static void main(String[] args) {
        // Create a new Node with data 10
        Node node1=new Node(34);
        Node node2=new Node(45);

        // Print the data of the node
        System.out.println(node1.data);
        System.out.println(node2.data);
        System.out.println(node1.next);// Accessing 'data' through the instance 'node1'
    }
}
