package TcscodeVita;

import java.util.ArrayList;
import java.util.Scanner;

public class CosecutivePrimeSum {

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find all primes less than n
    static ArrayList<Integer> findPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Function to count the number of consecutive prime sums less than n
    static void primeSumCount(int n) {
        ArrayList<Integer> primes = findPrimes(n);
        int count = 0;

        // Try to form sums of consecutive primes
        for (int i = 0; i < primes.size(); i++) {
            int sum = 0;
            for (int j = i; j < primes.size(); j++) {
                sum += primes.get(j);
                if (sum >= n) {
                }
                count++;  // Increment count for valid prime sums
            }
        }

        // Print the total number of consecutive prime sums less than n
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read input n
        primeSumCount(n);  // Call the function to calculate and print the count of prime sums
    }
}
