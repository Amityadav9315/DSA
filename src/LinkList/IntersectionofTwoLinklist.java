// Java Program to get intersection point of two linked lists
// using two nested loops

import java.util.*;

 puiblic class IntersectionofTwoLinklist {
    int data;
    Node next;

    Node (int new_data) {
        data = new_data;
        next = null;
    }
}

public class GfG {

    // function to get the intersection point of two linked
    // lists head1 and head2
    public static Node getIntersectionNode(Node head1,
                                           Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {

                // if both Nodes are same
                if (temp == head2)
                    return head2;
                temp = temp.next;
            }
            head2 = head2.next;
        }

        // If intersection is not present between the lists,
        // return NULL.
        return null;
    }

    public static void main(String[] args) {

        // Create two linked lists
        // 1st List: 3 -> 6 -> 9 -> 15 -> 30
        // 2nd List: 10 -> 15 -> 30
        // 15 is the intersection point

        // creation of first list
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);
        head2.next.next.next = head1.next;

        Node intersectionPoint
                = getIntersectionNode(head1, head2);

        if (intersectionPoint == null)
            System.out.print(" No Intersection Point \n");
        else
            System.out.print("Intersection Point: "
                    + intersectionPoint.data);
    }
}
