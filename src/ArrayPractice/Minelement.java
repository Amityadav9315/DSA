package ArrayPractice;

import java.util.Scanner;

public class Minelement {

    static void minelement(int n,int arr[]){
        int min=arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum element is:"+ " "+ min);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        minelement(n,arr);
    }
}
