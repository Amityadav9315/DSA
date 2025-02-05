package Shorting;

import java.util.Scanner;

public class quicksortsecond {


    static int partition(int[] arr,int low,int high){



    }


    static void quickSort(int[] arr,int low ,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);

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
