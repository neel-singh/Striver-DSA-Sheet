// probelem: Maximum Sum Subarray
// pattern: Kadane's Algorithm
// Tiime Complexity: O(n)
// Space complexity: O(1)

import java.util.*;

class Kadane {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++){
            sum = Math.max(sum + nums[i], nums[i]);

            res = Math.max(res, sum);
        }

        return res;
    }
}
