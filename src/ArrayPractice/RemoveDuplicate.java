package ArrayPractice;

import java.util.Scanner;

public class RemoveDuplicate {

    // Function to remove duplicates from a sorted array
    static void removeDuplicate(int n, int array[]) {
        if (n == 0) return;  // If the array is empty, do nothing

        int[] array1 = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array1[j++] = array[i];
            }
        }

        // Add the last element
        array1[j++] = array[n - 1];

        // Print the result (array without duplicates)
        for (int i = 0; i < j; i++) {
            System.out.println(array1[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array before removing duplicates (if not sorted)
        // If the array is already sorted, this step can be skipped
        java.util.Arrays.sort(array);

        // Call the function to remove duplicates
        removeDuplicate(n, array);
    }
}
