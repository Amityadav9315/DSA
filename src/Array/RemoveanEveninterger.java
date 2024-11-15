package Array;

import java.util.Scanner;

public class RemoveanEveninterger {

    static void Removeeven(int n,int arr[],int sum){
        for(int i=0; i<n; i++ ){
            if(arr[i]%2!=0) {
                sum++;
            }
        }
        //for(int x:sum){
            System.out.println(sum);
       // }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        Removeeven(n,arr,sum);

    }
}
