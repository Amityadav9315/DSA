import java.util.Scanner;

public class MatrixMultiplication {

    // Method to perform matrix multiplication
    static void matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int r2, int c2) {
        // Resultant matrix will have dimensions r1 x c2
        int[][] resultMatrix = new int[r1][c2];

        // Perform matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                resultMatrix[i][j] = 0; // Initialize the element
                for (int k = 0; k < c1; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j]; // Accumulate the product
                }
            }
        }

        // Print the resulting matrix
        System.out.println("Resultant Matrix:");
        for (int[] row : resultMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter the number of rows for the first matrix:");
        int r1 = scanner.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int c1 = scanner.nextInt();

        int[][] firstMatrix = new int[r1][c1];
        System.out.println("Enter the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter the number of rows for the second matrix (should be equal to columns of the first matrix):");
        int r2 = scanner.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int c2 = scanner.nextInt();

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible. The number of columns of the first matrix must equal the number of rows of the second matrix.");
            return;
        }

        int[][] secondMatrix = new int[r2][c2];
        System.out.println("Enter the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        // Call the matrix multiplication function
        matrixMultiplication(firstMatrix, secondMatrix, r1, c1, r2, c2);
    }
}