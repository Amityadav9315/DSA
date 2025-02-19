package ArrayPractice;

import java.util.Scanner;

public class PrimeNumber {



    static void primeNumber(int n){
        int count=1;
        if(n<=1){
            System.out.println("Not  prime number");
        }
        for(int i=2; i<=n; i++ ){
          if(n%i==0){
              count++;
          }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeNumber(n);

    }
}
