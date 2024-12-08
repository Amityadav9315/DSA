package ArrayPractice;

import java.util.Scanner;

public class MaxswaptoSortArray {
    static void maxSwaptoSortArray(int n,int array[]) {

        int[] array2 = new int[n];
        int index = 0;
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            array2[index++] = min;


        }
    }







    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
             array[i]=sc.nextInt();
        }
    }
}
