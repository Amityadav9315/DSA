package ArrayPractice;

import java.util.Scanner;

public class LeftRotateBykposition {
    static void leftRotatekposition(int n,int k,int array[],int array2[]){

         for(int i=0; i<k; i++){
             array2[i]=array[i];
         }
         for(int i=0; i<k; i++){
             array[i]=array[k+i];
         }
         for(int i=0; i<k;i++){

                 array[n-k+i]=array2[i];

         }
         for(int x:array){
             System.out.print(x+" ");
         }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] array=new int[n];
        int[] array2=new int[k];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();

        }
        leftRotatekposition(n,k,array,array2);

    }
}
