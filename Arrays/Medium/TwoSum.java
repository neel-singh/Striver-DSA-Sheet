// probelem: Two Sum
// pattern: traversing
// Tiime Complexity: O(n)
// Space complexity: O(n)

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];

        for(int i = 0; i < nums.length; i++){

            int diff = target - nums[i];

            if(map.containsKey(diff)){
                res[0] = map.get(diff);
                res[1] = i;

                return res;
            }
            else{
                map.put(nums[i], i);
            }
        }

        return res;
    }
}
