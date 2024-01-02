public class Factorial {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        for (int i = 0; i < inputNumbers.length; i++) {
            findFactorial(inputNumbers[i]);
        }
    }

    public static int findFactorial(int inputNumber) {

        int factorial = 1;
        for (int j = 1; j <= inputNumber; j++) {
            factorial *= j;
        }
        System.out.println("Factorial of " + inputNumber + ": " + factorial);
        return factorial;
    }
}

