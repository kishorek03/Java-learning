package Array_Problems;

import Helper_Classes.PrintHelper;
import Helper_Classes.ScannerHelper;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[]ans=new int[nums.length];
        int count=0;
        for(int i= nums.length-1;i>=0;i--){
        ans[i]=nums[i];
        count++;
            if(k==count){
            break;
            }
        }
    }
    public static void rotate1(int[] nums, int k) {
        int []outArr = new int[nums.length];
        for (int i = 0; i <outArr.length; i++) {
            outArr[i]=i<k?nums[i+nums.length-k]:nums[i-(k)];
        }nums=outArr;

        PrintHelper.printArray(nums);
    }

    public static void main(String[] args) {
        rotate1(ScannerHelper.getInputInts(), 1);
    }
}
