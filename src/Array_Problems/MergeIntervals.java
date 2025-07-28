package Array_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public  static int[][] mergeIntervalsOverlapping(int[][]intervals){
        if(intervals==null || intervals.length==0)return new int[0][];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        for(int [] interval:intervals){
            if(ans.isEmpty()|| interval[0]>ans.get(ans.size()-1)[1]){
                ans.add(interval);
            }else {
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        // Test cases
        int[][] test1 = {};  // empty
        int[][] test2 = {{1,3}};  // single interval
        int[][] test3 = {{1,4},{4,5}};  // touching intervals
        int[][] test4 = {{1,4},{2,3}};  // completely overlapping
        int[][] test5 = {{1,3},{2,6},{8,10},{15,18}};  // multiple merges
        int[][] test6 = {{-3,-1},{-2,2},{0,3}};  // negative numbers

        System.out.println(Arrays.deepToString(mergeIntervalsOverlapping(test1)));
        System.out.println(Arrays.deepToString(mergeIntervalsOverlapping(test2)));
        System.out.println(Arrays.deepToString(mergeIntervalsOverlapping(test3)));
        System.out.println(Arrays.deepToString(mergeIntervalsOverlapping(test4)));
        // ... and so on for other test cases
    }
}
