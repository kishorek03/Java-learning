package Array_Problems;

import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(hasSubarraySum(arr,target));
    }

    private static String hasSubarraySum(int[] arr, int target) {
       int start=0,end=0,sum=0;
       while(end<arr.length){
           sum+=arr[end];
           while(sum>target && start<=end){
               sum-=arr[start];
               start++;
           }
            if(sum==target)return "yes";
            end++;
       }
       return "no";
    }
}
