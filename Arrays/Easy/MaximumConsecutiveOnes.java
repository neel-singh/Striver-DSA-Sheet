// Problem: Maximum Consecutive Ones
// Pattern: traversing
// Time Complexity: O(n)
// Space Complexty: O(1)

import java.util.*;

class MaxOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        for(int ele : nums){
            if(ele == 1){
                count++;
                if(max < count){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }

        return max;
    }
}
