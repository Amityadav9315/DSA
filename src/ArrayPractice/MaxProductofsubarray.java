package ArrayPractice;

import java.util.Scanner;

public class MaxProductofsubarray {

    static void maxProductofSubarray(int n, int array[]) {
        int max = array[0];
        for (int i = 1; i < n; i++) {

            max = max * array[i];
        }
        System.out.println(max);


    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        maxProductofSubarray(n,array);


    }
}
