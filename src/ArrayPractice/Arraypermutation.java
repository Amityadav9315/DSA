package ArrayPractice;

import java.util.Scanner;

public class Arraypermutation {
    static  void  arrayPermutation(int n, int array[]){
        int array1[]=new int[n];
        for(int i=n-1; i>=0; i--){
            array1[n-i-1]=array[i];


        }
        for(int x:array1){
            System.out.println(array1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        arrayPermutation(n,array);
    }
}
