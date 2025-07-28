package Array_Problems;

public class MinimumSwaps {
    public static int minSwapsToGroupOnes(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int totalOnes = 0;
        for (int n : arr) totalOnes += n;

        if (totalOnes <= 1) return 0;

        int minSwaps = Integer.MAX_VALUE, zeros = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (arr[i] == 0) zeros++;
        }

        minSwaps = zeros;

        for (int i = totalOnes; i < arr.length; i++) {
            if (arr[i - totalOnes] == 0) zeros--;
            if (arr[i] == 0) zeros++;
            minSwaps = Math.min(minSwaps, zeros);
        }

        return minSwaps;
    }
}
