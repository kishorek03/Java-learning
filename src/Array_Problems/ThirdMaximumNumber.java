package Array_Problems;

import Helper_Classes.ScannerHelper;

public class ThirdMaximumNumber {
    public static int thirdMax(int[]nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int num : nums) {
            if (num>max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num < max1 && num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num < max2 && num > max3) {
                max3 = num;
            }
        }
        if (max3 == Long.MIN_VALUE) {
            return (int) max1;
        }
        return (int)max3;
    }
    public static void main(String[] args) {
        int[] nums= ScannerHelper.getInputInts();
        int result =thirdMax(nums);
        System.out.println("the third maximum number is "+ result);
    }
}
