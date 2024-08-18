package Array_Problems;

import Helper_Classes.ScannerHelper;

public class SumOf1DArray {
    public static int[]runningSum(int[]nums){
        for(int i =1;i< nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }return nums;
    }

    public static void main(String[] args) {
        int [] inputNumbers = ScannerHelper.getInputInts();
        int []result=runningSum(inputNumbers);
        for (int num : result) {
            System.out.print(num + " ");}

    }
}

