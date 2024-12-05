package ArrayPractice;

import java.util.Scanner;

public class MatrixMultiplication {
    static void matrixmultiplication(int r1, int c1, int arr[][], int arr1[][], int r2, int c2) {
        // Resultant matrix will have dimensions r1 x c2
        int[][] arr2 = new int[r1][c2];

        // Perform matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = 0; // Initialize the element
                for (int k = 0; k < c1; k++) {
                    arr2[i][j] += arr[i][k] * arr1[k][j]; // Accumulate the product
                }
            }
        }

        // Print the resulting matrix
        System.out.println("Resultant Matrix:");
        for (int[] row : arr2) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter the number of rows for the first matrix:");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int c1 = sc.nextInt();

        int[][] arr = new int[r1][c1];
        System.out.println("Enter the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter the number of rows for the second matrix (should be equal to columns of first matrix):");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible. Columns of first matrix must equal rows of second matrix.");
            return;
        }

        int[][] arr1 = new int[r2][c2];
        System.out.println("Enter the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Call the matrix multiplication function
        matrixmultiplication(r1, c1, arr, arr1, r2, c2);
    }
}