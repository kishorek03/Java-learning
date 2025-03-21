package Array_Problems;

import java.util.ArrayList;
import java.util.List;

public class LeastPrimeToAdd {
    public static List<Integer> leastPrimeAdd(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> primes = PrimeArray(1000);

        for (int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i], num2 = arr2[i];
            int found = -1;

            for (int prime : primes) {
                if ((num1 + prime) % num2 == 0) {
                    found = prime;
                    break;
                }
            }

            result.add(found);
        }
        return result;
    }
    public static List<Integer> PrimeArray(int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Mark non-primes using Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int[] arr1 = {20, 7};
        int[] arr2 = {11, 5};

        System.out.println(leastPrimeAdd(arr1, arr2)); // Output: [2, 3]
    }
}
