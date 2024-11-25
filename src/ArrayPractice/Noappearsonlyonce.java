package ArrayPractice;

import java.util.Scanner;

public class Noappearsonlyonce {

    static  void noappearsonlyonce(int n,int a[]){
        int[] array=new int[n];
        int index=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                if(a[i]!=a[j]) {


                    array[i++] = a[j];
                }

            }
        }
        for(int x: array){
            System.out.println(x);
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        noappearsonlyonce(n,a);

    }
}
