package Array_Problems;

import Helper_Classes.PrintHelper;
import Helper_Classes.ScannerHelper;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = ScannerHelper.getInputInts(); // [1, 2, 3, 0, 0, 0]
        int[] nums2 = ScannerHelper.getInputInts(); // [2, 5, 6]
        merge(nums1, m, nums2, n);
        PrintHelper.printArray(nums1); // Output: 1 2 2 3 5 6
    }
}
