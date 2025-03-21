package Array_Problems;

import java.util.TreeSet;

public class DistinctNumbersInArray {
    public static void main(String[] args) {
            int[] nums1 = {131, 11, 48};
            int[] nums2 = {111, 222, 333, 4444, 666};

            printDistinctDigits(nums1); // Output: 1 3 4 8
            System.out.println();
            printDistinctDigits(nums2); // Output: 1 2 3 4 6
    }
    public static void printDistinctDigits(int[] nums) {
        TreeSet<Character> set = new TreeSet<>(); // TreeSet maintains sorted order

        for (int num : nums) {
            String numStr = String.valueOf(num);
            for (char digit : numStr.toCharArray()) {
                set.add(digit);
            }
        }

        for (char digit : set) {
            System.out.print(digit + " ");
        }
    }
}

