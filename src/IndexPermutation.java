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
        int []nums={0,2,1,5,3,4};
        int []result =buildArray(nums);
        for (Integer arr: result){
            System.out.print(arr+" ");

        }
    }
}


