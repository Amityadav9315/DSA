package ArrayPractice;

import java.util.Scanner;

public class Maxproduct {

    static  void maxProduct(int n,int array[]){
        int[] array2=new int[10];
        int index=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                array2[index++]=(array[i])*(array[j]);

            }
        }
        for(int x:array2){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        maxProduct(n,array);

    }
}
