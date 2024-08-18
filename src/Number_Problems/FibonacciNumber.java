package Number_Problems;

import Helper_Classes.ScannerHelper;

public class FibonacciNumber {
    public static long getFibonacci(int n) {
        if (n <= 1) return n;
        long num1 = 0, num2 = 1;
        long num = 1;
        for (int i = 2; i <= n; i++) {
            num = num1 + num2;
            num1 = num2;
            num2 = num;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        for (int input : inputNumbers) {
            long fibonacci = getFibonacci(input);
            System.out.println(fibonacci);
        }
    }
}
