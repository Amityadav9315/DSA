package ArrayPractice;

import java.util.Scanner;

public class LeftRotateByOneposition {
    static  void leftrotate(int n,int array[]){
        int temp=array[0];
        for(int i=0; i<n-1; i++){

        array[i]=array[i+1];

        }
        array[n-1]=temp;
        for(int x:array){
            System.out.print(x+" ");
        }


        }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();

        }
        leftrotate(n,array);

    }



}
