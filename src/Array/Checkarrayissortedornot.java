package Array;

import java.util.Scanner;

public class Checkarrayissortedornot {
    static  void checksorted(int n,int arr[]){
        int count=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                count++;

            }

        }
        if(count==n-1){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        checksorted(n,arr);
    }
}
