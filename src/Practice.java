import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public long maximizeXorAndXor(int[] nums) {
        int[] kishoresum = nums;
        int n = kishoresum.length;

        int totalXor = 0;
        for (int num : kishoresum) {
            totalXor ^= num;
        }

        long maxGlobalScore = 0;

        for (int bMask = 0; bMask < (1 << n); bMask++) {
            List<Integer> acNumbers = new ArrayList<>();
            int andOfB = -1;
            int xorOfB = 0;

            for (int i = 0; i < n; i++) {
                if (((bMask >> i) & 1) == 1) { // In B
                    xorOfB ^= nums[i];
                    if (andOfB == -1) {
                        andOfB = nums[i];
                    } else {
                        andOfB &= nums[i];
                    }
                } else { // In A or C
                    acNumbers.add(nums[i]);
                }
            }
            if (andOfB == -1) {
                andOfB = 0;
            }

            int m = totalXor ^ xorOfB;
            int optimizationMask = ~m;
            List<Integer> basis = new ArrayList<>();
            for (int num : acNumbers) {
                int maskedNum = num & optimizationMask;
                for (int b : basis) {
                    maskedNum = Math.min(maskedNum, maskedNum ^ b);
                }
                if (maskedNum > 0) {
                    basis.add(maskedNum);
                }
            }
            long maxAndTerm = 0;
            for (int b : basis) {
                maxAndTerm = Math.max(maxAndTerm, maxAndTerm ^ b);
            }
            maxGlobalScore = Math.max(maxGlobalScore, (long)andOfB + m + (2 * maxAndTerm));
        }
        return maxGlobalScore;
    }
}