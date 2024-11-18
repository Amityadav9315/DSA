package Searching;

import java.util.Scanner;

public class LinearSearch {

    static  void linearsearch(int n,int array[],int target){
        int count=0;
        for(int i=0; i<n; i++){
            if(array[i]==target){
                count=i;
            }
        }
        System.out.println("target is at index"+" " + count);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=20;
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        linearsearch(n,array,target);


    }
}
