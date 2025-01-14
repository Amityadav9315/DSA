package Searching;

import java.util.Scanner;

public class BinarySearching {



    static int  binarySearch(int[] arr ){
        int target=33;
        int n= arr.length;

        int low=0;
        int high= arr.length-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;

        } else if (target==mid) {

        }
        else {
            high=mid-1;
        }


    }








    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

    }
}
