package ArrayPractice;

import java.util.Scanner;

public class Mergetwoarray {

    static  void mergeSort(int n,int m,int a[],int b[],int c[]){

        for(int i=0; i<n; i++){
            c[i]=a[i];

        }
        for(int i=0; i<m; i++){
            c[i+n]=b[i];
        }
        for(int x:c){
            System.out.println(x);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int[] c=new int[m+n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        mergeSort(n,m,a,b,c);

    }
}
