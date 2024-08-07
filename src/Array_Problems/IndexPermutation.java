package Array_Problems;

import number.problems.ScannerHelper;

public class IndexPermutation {
    public static int[] buildArray(int[] nums){
        for (int i=0;i<nums.length;i++){
            nums[i]+=(nums[nums[i]]%nums.length)* nums.length;
        }
        for (int i=0;i<nums.length;i++){
            nums[i]/=nums.length;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = ScannerHelper.getInputInts();
        int []result =buildArray(nums);
        for (Integer arr: result){
            System.out.print(arr+" ");

        }
    }
}


