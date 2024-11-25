package ArrayPractice;

import java.util.Scanner;

public class sumofpair {
    static  void sumofPair(int n,int arr[]){
        int array[]=new int[n];
        for(int i=0; i<n-1; i++){
            array[i]=arr[i]+arr[i+1];
        }
        for(int x:array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        sumofPair(n,arr);

    }
}
