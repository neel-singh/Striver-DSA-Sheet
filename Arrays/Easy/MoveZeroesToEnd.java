// Problem: Move Zeroes to end
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class MoveZeroesToEnd{
      public void moveZeroes(int[] nums) {

        int i = 0;
        int j = i+1;
        
        while(j < nums.length){
            
            if(nums[i] != 0){
                if(i < j){
                    i++;
                }
                else{
                    j++;
                    i++;
                }
            }

            if(nums[j] != 0 && nums[i] == 0){
                //swap
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}
