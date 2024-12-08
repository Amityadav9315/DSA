package ArrayPractice;

import java.util.Scanner;

public class MaxProductofsubarray {

    static void maxProductofSubarray(int n, int array[]) {
        int[] array2=new int[n];
        int index=0;

        for (int i = 0; i < n; i++) {
            int max = array[i];
            for(int j=i+1; j<n; j++){
                 max=max*array[j];
            }
            array2[index++]=max;



        }
        int value=0;
        for(int i=0; i<n; i++){
            if(array2[i]>value){
                value=array2[i];
            }


        }
        System.out.println(value);



    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        maxProductofSubarray(n,array);


    }
}
