// Problem: Find missing number in an array
// Pattern: traversing
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class FindMissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = ((n) * (n+1)) / 2;

        int eleSum = 0;
        for(int ele : nums){
            eleSum += ele;
        }

        int missing = sum - eleSum;
        return missing;
    }
}
