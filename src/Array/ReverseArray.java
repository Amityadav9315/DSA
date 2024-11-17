package Array;

import java.util.Scanner;

public class ReverseArray {
    static void reversearray(int n,int array[]){
        int[] arr=new int[n];

        for(int i=n-1; i>=0; i--){

            System.out.println(array[i]);

        }

    }





    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=scanner.nextInt();

        }
        reversearray(n,array);

    }
}
