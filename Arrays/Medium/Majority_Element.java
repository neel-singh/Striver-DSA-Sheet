// Problem: Majority Element
// Pattern: traversing
// Time Complexity: O(n)
// Space Complexity: o(1)

import java.util.*;

class MajorityElement {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(ele == nums[i]){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                ele = nums[i];
                count++;
            }
        }

        return ele;
    }
}
