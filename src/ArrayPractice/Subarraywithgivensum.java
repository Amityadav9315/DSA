package ArrayPractice;

import java.util.Scanner;

public class Subarraywithgivensum {
    static void subarraywithGivensum(int n,int arr[]){

        int sum=20;
        int sum2=0;
        for(int i=0; i<n; i++){
            sum2=sum2+arr[i]+arr[i+1];
            if(sum==sum2){
                System.out.println("Sum is found");
                break;
            }
        }


    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        subarraywithGivensum(n,arr);



    }
}
