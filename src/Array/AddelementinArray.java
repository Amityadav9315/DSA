package Array;
import java.util.*;

public class AddelementinArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=20;
        int[] arr=new int[n+1];
        System.out.println();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        for(int i=arr.length-2; i>=2;i--){
            arr[i+1]=arr[i];


        }
        arr[2]=a;
        for(int x:arr){
            System.out.println(x);
        }

    }
}
