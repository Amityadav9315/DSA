package ArrayPractice;

import java.util.Scanner;

public class CountNoofdigits {

    static void countNoofdigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }
        System.out.println("No of digit is:" + count );
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countNoofdigit(n);

    }
    
}
