package ArrayPractice;

import java.util.Scanner;

public class MergeTwoSortedArray {
    static void mergetwoSortedArray(int n, int m, int[] arr1, int[] arr2) {
        int[] mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }
        for (int x : mergedArray) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter size of first array (n): ");
        int n = sc.nextInt();
     //   System.out.print("Enter size of second array (m): ");
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Merged Sorted Array:");
        mergetwoSortedArray(n, m, arr1, arr2);
    }
}
