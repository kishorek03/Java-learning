package Array_Problems;

import Helper_Classes.PrintHelper;

import static Helper_Classes.ScannerHelper.*;

public class MaxSumOfArray {
    public static int maximumArray(int[][] nums) {
        int result = Integer.MIN_VALUE;
        for (int[] num : nums) {
            int temp = 0;
            for (int value : num) {
                temp += value;
            }
            result = Math.max(result, temp);
        }
        return result;
    }

    public static void main(String[] args) {
        int numberOfInputs = 0;
        System.out.println("Please enter the number of inputs required: ");
        do {
            numberOfInputs = in.nextInt();
        } while (validateInputInt(numberOfInputs));
        int[][] _2d = new int[numberOfInputs][];
        for (int i = 0; i < numberOfInputs; ++i) {
            _2d[i]= getInputInts();
            System.out.println("Array"+ (i + 1) + " contents:");
            PrintHelper.printArray(_2d[i]);
        }
        int n=maximumArray(_2d);
        System.out.println("hence the Maximum array is " + n);


    }
}
