package ArrayPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CommonAmongthree {
    static void commonAmongthree(int n,int arr[],int arr1[],int arr2[]) {
        int value = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    if (arr[i] == arr1[j] && arr1[j] == arr2[k] && arr2[k] == arr[i]) {
                        value = arr[i];
                        break;
                        System.out.println();

                    }
                }
            }

        }
        System.out.println(value);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        commonAmongthree(n,arr,arr1,arr2);
    }
}
