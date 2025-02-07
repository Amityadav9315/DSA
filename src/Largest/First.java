package Largest;

import java.util.Scanner;

public class First {


    static void Firstlargest(int n,int[]  arr){
        int max=0;

        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum no is" +  max);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        Firstlargest(n,arr);

    }
}
