// probelem: Two Sum
// pattern: traversing
// Tiime Complexity: O(n)
// Space complexity: O(n)

import java.util.*;

class ReArrangeBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int i = 0;
        int j = 0;

        for(int ele : nums){
            if(ele < 0){
                neg[i] = ele;
                i++;
            }
            else{
                pos[j] = ele;
                j++;
            }
        }

        int idxi = 0;
        int idxj = 0;

        for(int k = 0; k < nums.length; k++){
            if(k % 2 == 0){
                nums[k] = pos[idxi];
                idxi++;
            }
            else{
                nums[k] = neg[idxj];
                idxj++;
            }
        }

        return nums;
    }
}
