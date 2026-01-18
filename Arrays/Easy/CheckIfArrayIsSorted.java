// Problem: Check if array is sorted and rotated
// Pattern: traversing
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class SortedAndRoatated {
    public boolean check(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                count++;
            }
        }
        if(count <= 1){
            return true;
        }
        else{
            return false;
        }
    }
}
