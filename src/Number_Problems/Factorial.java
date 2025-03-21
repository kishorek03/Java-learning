package Number_Problems;

import Helper_Classes.ScannerHelper;

public class Factorial {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        for (int i = 0; i < inputNumbers.length; i++) {
            int result = recusiveFactorial(inputNumbers[i]);
            System.out.println("Factorial of " + inputNumbers[i] + ": " + result);
        }
    }

    public static int findFactorial(int inputNumber) {
        int factorial = 1;
        for (int j = 1; j <= inputNumber; j++) {
            factorial *= j;
        }
        return factorial;
    }
    public static int recusiveFactorial(int n){
        if(n==1)
            return 1;
        else{
            return n*recusiveFactorial(n-1);
        }

    }
}
