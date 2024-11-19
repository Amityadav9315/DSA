package ArrayPractice;

import java.util.Scanner;

public class Printalternateposition {
    static  void alternateposition(int n,int arr[]){
        //int[] array=new int[n];
        for(int i=0; i<n; i=i+2){
           // array[n]=arr[i];
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        alternateposition(n,arr);
    }
}
