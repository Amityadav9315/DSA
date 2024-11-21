package ArrayPractice;

import java.util.Scanner;

public class Moveallthezerotoendofarray {
    static void moveallzerotoend(int n,int a[]){
        int index=0;

        for(int i=0; i<n; i++){
            if(a[i]!=0){
                a[index]=a[i];
                index++;
            }

        }
        while(index<n){
            a[index]=0;
            index++;
        }
        for(int x: a){
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
        moveallzerotoend(n,a);
    }
}
