package Array_Problems;

import Helper_Classes.PrintHelper;
import Helper_Classes.ScannerHelper;

import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int []nums= ScannerHelper.getInputInts();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value to remove");
        int val= s.nextInt();
        System.out.println(removeElement(nums,val));
        PrintHelper.printArray(nums);


    }
}
