package Shorting;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class BubbleSorting {

    static void bubblesort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                    if(arr[j]<arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
            }


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
