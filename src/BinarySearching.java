public class BinarySearching {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(rotatedBinarySearch(arr,0));;
    }

    private static int rotatedBinarySearch(int[]nums,int target) {
        int low=0,high=nums.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] >= nums[low]) { // Left half is sorted
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Right half is sorted
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    private static int binarySearch(int[] nums, int target,int low,int high){
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    private static int firstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result = mid; // Record the index
                high = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    private static int lastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result = mid; // Record the index
                low = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    private static int findPeakElement(int [] nums,int target){
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }else {
                low = mid + 1;
            }
        }
        return high;
    }
    private static int ceiling(int [] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]) return mid;
            else if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    private static int floor(int [] nums,int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    private static int infinite(int []nums,int target){
        int start =0;
        int end=1;
        while(target>nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
         return binarySearch(nums,target,start,end);
    }
}
