package Number_Problems;

import Helper_Classes.ScannerHelper;

public class ReverseNumber {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        reversingNumber(inputNumbers);
    }

    public static void reversingNumber(int[] inputNumbers) {
        for (int i = 0; i < inputNumbers.length; i++) {
            int number = inputNumbers[i];
            int reverse = 0;
            while (number != 0) {
                int result = number % 10;
                reverse = reverse * 10 + result ;
                number /= 10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }
}
