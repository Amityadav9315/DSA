package Searching;

import java.util.Scanner;

public class BinarySearch {
    static  void  linearsearch(int n,int array[]) {
        int low = array[0];
        int target = 50, fount = 0;
        int high = array[n - 1];
        for (int i = 0; i < n; i++) {
            int mid = low + ((high - low) / 2);
            if (mid == target){
                System.out.println(mid);
            } else if (target > array[mid]) {
                high = array[n-1];
                low = array[mid+1];

            } else if (target < array[mid]) {
                high = array[mid-1];
            }

        }
        System.out.println("Not found");


    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

        }
    }
