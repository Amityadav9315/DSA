package Algorithm;

import java.util.Scanner;

public class KadaneSumofMaxsubarray {

    static  void kadansumofmaxsubarray(int n,int arr[]){
        int max=0,sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
            if(sum>max) {
                max = sum;
            }
                sum=0;


        }
        System.out.println(max);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        kadansumofmaxsubarray(n,arr);
    }
}
