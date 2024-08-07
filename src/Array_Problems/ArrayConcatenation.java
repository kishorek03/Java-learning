package Array_Problems;

import Helper.PrintHelper;
import Helper.ScannerHelper;

public class ArrayConcatenation {
    public static int[] concateArray(int[] nums) {
        int[] result = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] inputNumbers = ScannerHelper.getInputInts();
        int[] result = concateArray(inputNumbers);
        PrintHelper.printArray(result);
        
    }
}
