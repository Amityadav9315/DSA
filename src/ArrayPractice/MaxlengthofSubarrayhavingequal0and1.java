package ArrayPractice;

import java.util.Scanner;

public class MaxlengthofSubarrayhavingequal0and1 {

    static  void maxlengthofSubarray(int n,int array[]){
        int count1=0;
        int count2=0;
        int max=0;
        for(int i=0; i<n; i++){
            if(array[i]==0){
                count1++;

            }
            else{

                count2++;
            }
            if(count1==count2){
                max=array[i];
            }

        }
        System.out.println(max);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        maxlengthofSubarray(n,array);

    }
}
