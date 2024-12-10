package ArrayPractice;

import java.util.Scanner;

public class Smallestsubarraysumgreaterthanvalue {

    static void smallestSubarray(int n,int array[]){

        int value=30;
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++) {
                sum = array[i] + array[j];

                if(sum>value) {
                    System.out.println(array[i] + "," + array[j]);


                }



            }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();

        }
        smallestSubarray(n,array);
    }

}
