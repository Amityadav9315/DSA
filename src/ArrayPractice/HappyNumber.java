package ArrayPractice;

import java.util.Scanner;

public class HappyNumber {
    static  void happyNumber(int n) {

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem;

        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    }
}
