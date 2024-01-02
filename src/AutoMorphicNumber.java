public class AutoMorphicNumber {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        int[] randomNums = ScannerHelper.getRandomInts();
        checkAutoMorphicNumber(inputNumbers);
        checkAutoMorphicNumber(randomNums);
    }

    public static void checkAutoMorphicNumber(int[] inputNumbers) {
        for (int input : inputNumbers) {
            int lengthOfNumber = findLength(input);
            int square = input * input;
            int digit = (int) (square % Math.pow(10, lengthOfNumber));
            if (input == digit) {
                System.out.println("The given no " + input + " is AutoMorphic Number");
            } else {
                System.out.println("The number " + input + " is not a AutoMorphic Number");
            }
        }
    }

    public static int findLength(int inputNumber) {
        int length = 1;
        while (inputNumber >= 10) {
            inputNumber = inputNumber / 10;
            length++;
        }
        return length;
    }
}
