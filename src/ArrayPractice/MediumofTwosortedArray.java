package ArrayPractice;

import java.util.Scanner;

public class MediumofTwosortedArray {

    static void medoumofTwosortedArray(int n,int array[],int array2[]){
        int[] array3=new int[2*n];
        int index=0;


        for(int i=0; i<n; i++){
            //if(array[i]>array2[i]){
                array3[i]=array[i];



        }
        for(int i=array.length; i<array3.length; i++){
            array3[i]=array2[i-n];
        }
        for(int x:array3){
            System.out.print(x+" ");
        }
        System.out.println("Mid value is:"+array3[(2*n)/2]);


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }


        int[] array2=new int[n];
        for(int i=0; i<n; i++){
            array2[i]=sc.nextInt();
        }
        medoumofTwosortedArray(n,array,array2);

    }
}
