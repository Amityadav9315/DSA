package Array;

import java.util.Scanner;

public class Countoccuranceofelement {

    // Method to count the occurrences of 's' in the array
    static void countOccurrence(int n, int[] arr, int s) {
        int count = 0; // Initialize count
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                count++; // Increment count if the element matches 's'
            }
        }
        System.out.println("The element " + s + " occurred " + count + " times.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Take array elements input
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take the element to be searched
        System.out.print("Enter the element to count occurrences: ");
        int s = sc.nextInt();

        // Call the method to count occurrences
        countOccurrence(n, arr, s);

       // sc.close(); // Close the scanner to prevent resource leak
    }
}
