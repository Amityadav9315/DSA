package ArrayPractice;

import java.util.Scanner;

public class RightRotatearray {
    static  int rightRotate(int n,int arr[]) {

        int temp = arr[n - 1];
        for (int i = 0; i < n-1; i++) {
            arr[n - 1 - i] = arr[n - 2 - i];



        }
        arr[0]=temp;
        for(int x: arr){
            System.out.print(x+" ");
        }
        return -1;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        rightRotate(n,arr);



    }
}
