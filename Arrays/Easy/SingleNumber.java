// Problem: Find the number that appears once, and other numbers twice
// Pattern: Bit manipulation
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for(int i = 1; i < nums.length; i++){
            xor = xor^nums[i];
        }
        return xor;
    }
}
