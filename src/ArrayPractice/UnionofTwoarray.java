package ArrayPractice;

import java.util.Scanner;

public class UnionofTwoarray {

    static void unionOfArray(int n, int m, int array1[], int array2[]) {
        int[] array3 = new int[n + m];  // Array to store the union
        int index = 0;
        for (int i = 0; i < n; i++) {
            array3[index++] = array1[i];
        }

        for (int i = 0; i < m; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (array2[i] == array3[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                array3[index++] = array2[i];
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(array3[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[m];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
        unionOfArray(n, m, array1, array2);
    }
}
