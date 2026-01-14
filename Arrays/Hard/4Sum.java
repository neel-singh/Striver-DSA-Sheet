// Problem: 4Sum
// Pattern: Two Pointer
// Time Complexity: O(n^3)
// Space Complexity: O(1)

import java.util.*;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j = i+1; j < nums.length-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int k = j+1;
                int l = nums.length-1;

                while(k < l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[k]);
                        quad.add(nums[l]);

                        res.add(quad);

                        k++;
                        l--;

                        while(k < l && nums[k] == nums[k-1]){
                            k++;
                        }

                        while(k < l && nums[l] == nums[l+1]){
                            l--;
                        }
                    }

                    else if(nums[i] + nums[j] + nums[k] + nums[l] > target){
                        l--;
                    }

                    else{
                        k++;
                    }
                }
            }
        }

        return res;
    }
}
