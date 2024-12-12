package ArrayPractice;

import java.util.Scanner;

public class NoofSubarraySumEquatoValue {

    static  void noOfSubarray(int n,int array[]){
        int value=-10;
        //int sum=0;
        int count=0;
        for(int i=0; i<n; i++){
            int sum=array[i];
            for(int j=i+1; j<n; j++){
                sum=sum+array[j];
                if(sum==value){
                    count++;
                }


            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        noOfSubarray(n,array);


    }
}
