package Array_Problems;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[]arr={1,5,7,-1,5};
        int target=6;
        System.out.println(countPair(arr,target));
    }

    private static int countPair(int[] arr, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int count=0;
        for (int num:arr){
            int comp=target-num;
            if(mp.containsKey(comp))
                count+=mp.get(comp);
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        return count;
    }
}
