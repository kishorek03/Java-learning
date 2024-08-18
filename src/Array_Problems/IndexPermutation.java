package Array_Problems;

import Helper_Classes.ScannerHelper;

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

    public static class MaximumSumOfSubarray {
        public static int maxSubArray(int[] nums) {
            int currentSum=nums[0];
            int maxsum=nums[0];
            for(int i=1;i<nums.length;i++){
                System.out.println(currentSum);
                currentSum=Math.max(nums[i],currentSum+nums[i]);
                maxsum=Math.max(maxsum,currentSum);
            }

            return maxsum;
        }
    //[-2,1,-3,4,-1,2,1,-5,4]

        public static void main(String[] args) {
            int [] nums = ScannerHelper.getInputInts();
            System.out.println(maxSubArray(nums));

        }
    }
}


