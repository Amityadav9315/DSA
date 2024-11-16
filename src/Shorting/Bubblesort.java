package Shorting;

import java.util.Scanner;

public class Bubblesort {


    static  void bubblesort(int n,int arr[]){
        int temp=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
      bubblesort(n,arr);

    }
}
