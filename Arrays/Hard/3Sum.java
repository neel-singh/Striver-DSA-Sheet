// Problem: 3Sum
// Pattern: Two Pointer
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                if(nums[i] + nums[j]+ nums[k] == 0){
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);

                    res.add(triplet);

                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }

                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }

                else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }

                else{
                    j++;
                }
            }
        }

        return res;
    }
}
