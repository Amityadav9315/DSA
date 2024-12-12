package ArrayPractice;

import java.util.Scanner;

public class HappyNumber {
    static boolean isHappyNumber(int n) {
        int slow = n, fast = n;

        do {
            slow = sumOfSquaresOfDigits(slow); // Moves one step
            fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast)); // Moves two steps
        } while (slow != fast);

        return slow == 1; // If slow equals 1, the number is happy
    }

    static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();

        if (isHappyNumber(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
