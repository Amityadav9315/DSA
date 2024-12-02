package ArrayPractice;

import java.util.Scanner;

public class Sort0s1s2s {

    static void sort0s1s2s(int n, int[] array) {
        int index = 0;
        int min;
        boolean[] visited = new boolean[n]; // Track visited elements
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && array[j] < min) { // Find the smallest unvisited element
                    min = array[j];
                    minIndex = j;
                }
            }

            if (minIndex != -1) {
                visited[minIndex] = true; // Mark as visited
                array2[index++] = min;  // Add to the sorted array
            }
        }

        for (int x : array2) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sort0s1s2s(n, array);
    }
}
