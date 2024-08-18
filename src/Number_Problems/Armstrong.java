package Number_Problems;

import Helper_Classes.ScannerHelper;

import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        armstrongNo(inputNumbers);
    }

    public static void armstrongNo(int[] inputNumbers) {
        for (int inputNumber : inputNumbers) {
            int temp=inputNumber;
            int result = 0;
            int n = String.valueOf(inputNumber).length();

            while (temp != 0) {
                int remainder = temp % 10;
                result += Math.pow(remainder, n);
                temp /= 10;
            }

            if (result == inputNumber) {
                System.out.println(inputNumber + " is an Number_Problems.Armstrong number.");
            } else {
                System.out.println(inputNumber+ " is not an Number_Problems.Armstrong number.");

            }
        }
    }
}
