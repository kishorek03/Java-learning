public class Factorial {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        findFactorial(inputNumbers);
    }
    public static void findFactorial(int[] inputNumbers) {
        for (int i = 0; i < inputNumbers.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= inputNumbers[i]; j++) {
                factorial *= j;
            }
            System.out.println("Factorial of " + inputNumbers[i] + ": " + factorial);
        }
    }
}

