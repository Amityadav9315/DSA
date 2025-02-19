package TcscodeVita;

import java.util.ArrayList;
import java.util.Scanner;

public class CosecutivePrimeSum {

    static void primeSum(int n){

        int count1=1;
        int count2=0;
        int sum=0;
        for(int  i=2; i<n; i++){
            for(int j=2; j<n; j++){
                if(j%i==0){
                    count1++;
                }
                if(count1==2){
                    sum=sum+j;
                }

            }
        }

    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


    }


    }

