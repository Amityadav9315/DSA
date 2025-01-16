package Searching;

import java.util.Scanner;

public class BinarySearching {


    static int binarySearch(int[] arr) {
        int target = 33;
        int n = arr.length;

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }


        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result=binarySearch(arr);
        if(result!=-1){
            System.out.println(result);
        }
        else {
            System.out.println("Not found");
            System.out.println();

        }

    }
}

