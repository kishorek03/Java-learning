package Array_Problems;

import Helper_Classes.PrintHelper;
import Helper_Classes.ScannerHelper;

import java.util.Scanner;

public class SortedTwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int first=0;
        int last=numbers.length-1;
        int [] ans=new int[2];
        while(first<last){
            int sum=numbers[first] + numbers[last];
            if(sum==target){
                ans[0]=first+1;
                ans[1]=last+1;
                return ans;
            }else if(sum<target){
                first++;
            }else
                last--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers= ScannerHelper.getInputInts();
        Scanner s=new Scanner(System.in);
        System.out.println("please enter the target sum value");
        int target=s.nextInt();
        int[] arr=twoSum(numbers,target);
        PrintHelper.printArray(arr);

    }
}
