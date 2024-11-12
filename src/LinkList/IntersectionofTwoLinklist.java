package LinkList;

import java.util.*;

public class IntersectionofTwolinklist {

    // h1 is the head node of the first linked list
    // h2 is the head node of the second linked list
    static LinkedListNode h1, h2;

    static class LinkedListNode {
        int d;
        LinkedListNode nxt;

        LinkedListNode(int d) {
            this.d = d;
            nxt = null;
        }
    }

    // A utility method for returning the intersection node
    static LinkedListNode intersectionPoint(LinkedListNode h1, LinkedListNode h2) {
        LinkedListNode p1 = h1;
        LinkedListNode p2 = h2;

        if (p1 == null || p2 == null) {
            return null;
        }

        // Traverse through the linked lists until they reach the intersection node
        while (p1 != p2) {
            p1 = (p1 == null) ? h2 : p1.nxt;
            p2 = (p2 == null) ? h1 : p2.nxt;
        }

        return p1;  // Either the intersection node or null if there's no intersection
    }

    // A method for displaying the values of the nodes of a linked list
    void displayNodes(LinkedListNode l1) {
        while (l1 != null) {
            System.out.print(l1.d + " ");
            l1 = l1.nxt;
        }
    }

    // Main method
    public static void main(String[] args) {
        IntersectionofTwolinklist list = new IntersectionofTwolinklist();

        // Creating the first linked list
        h1 = new LinkedListNode(113);
        h1.nxt = new LinkedListNode(116);
        h1.nxt.nxt = new LinkedListNode(119);
        h1.nxt.nxt.nxt = new LinkedListNode(115);
        h1.nxt.nxt.nxt.nxt = new LinkedListNode(130);

        // Creating the second linked list
        h2 = new LinkedListNode(110);
        h2.nxt = h1.nxt.nxt.nxt;

        System.out.println("The first linked list is: ");
        list.displayNodes(h1);
        System.out.println();

        System.out.println("The second linked list is: ");
        list.displayNodes(h2);
        System.out.println();

        // Finding the first intersection node of the two linked lists
        LinkedListNode intersectNode = intersectionPoint(h1, h2);

        if (intersectNode != null) {
            System.out.println("The first intersection point of the linked lists is: " + intersectNode.d);
        } else {
            System.out.println("The first intersection point of the linked lists does not exist.");
        }
    }
}
