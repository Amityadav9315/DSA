package Array;

import java.util.Scanner;

public class Movezerotoend {

    static  void  movezerotoend(int n,int arr[]){
        int index=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;

            }


        }
        while(index< n){
            arr[index]=0;
            index++;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        movezerotoend(n,arr);

    }
}
