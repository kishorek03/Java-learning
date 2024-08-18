package Number_Problems;

import Helper_Classes.ScannerHelper;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        checkPrime(inputNumbers);
    }

    public static void checkPrime(int[] inputs) {
        for (int num1 : inputs) {
            if (num1 == 2 || num1 % 2 == 0) {
                System.out.println("The given number " + num1 + " is not a prime number!!");
            } else {
                for (int i = 3; i <= num1 / 2; i += 2) {
                    System.out.println("Modulus of " + num1 + " by " + i);
                    if (num1 % i == 0) {
                        System.out.println("The given number " + num1 + " is not a prime number!!");
                    } else if (i * i > num1) {
                        System.out.println("The given number " + num1 + " is a prime number");
                        break;
                    }
                }
            }
        }
    }
}