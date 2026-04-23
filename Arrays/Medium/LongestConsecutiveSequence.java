// probelem: Longest Consecutive Sequence
// pattern: HashSet
// Tiime Complexity: O(n)
// Space complexity: O(n)

import java.util.*;

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int res = 0;

        for(int ele : set){
            int count = 1;
            int n = ele;
            if(!set.contains(n - 1)){
                while(set.contains(n+1)){
                    count++;
                    n = n+1;
                }
            }
            res = Math.max(res, count);
        }

        return res;
    }
}
