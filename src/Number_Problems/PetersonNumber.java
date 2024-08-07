package Number_Problems;

import Helper.ScannerHelper;

public class PetersonNumber {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        for (int input : inputNumbers) {
            petersonNumber(input);
        }
    }

    public static void petersonNumber(int inputNumber) {
        int temp = inputNumber;
        int sum = 0;
        while (temp > 0) {
            int result = temp % 10;
            sum += Factorial.findFactorial(result);
            temp /= 10;
        }
        if (sum == inputNumber) {
            System.out.println("The given number is a Peterson Number");
        } else {
            System.out.println("The given number is not a Peterson Number");
        }
    }
}
