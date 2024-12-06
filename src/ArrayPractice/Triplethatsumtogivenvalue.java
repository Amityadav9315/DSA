package ArrayPractice;

import java.util.Scanner;

public class Triplethatsumtogivenvalue {

//    @Override
//    public String toString(int n,int array[]) {
//        return super.toString();
//
//    }

    static void  tripletthatsum(int n,int array[]){
        int value=0;
        int sum=20;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                value=array[i]+array[j];
                if(value==sum){
                    System.out.print(array[i] + array[j]+ array[j-1]);
                    break;
                }


            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        tripletthatsum(n,array);

    }
}
