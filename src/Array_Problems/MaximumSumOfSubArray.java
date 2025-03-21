package Array_Problems;

import Helper_Classes.ScannerHelper;

public class MaximumSumOfSubArray {
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
        System.out.println(longestKSubarray(nums,3));


    }


    public static int longestKSubarray(int[]arr, int k) {
        int left=0,right=0,maxlen=0;
        int n=arr.length;
        int sum=arr[0];
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxlen;

    }
}

