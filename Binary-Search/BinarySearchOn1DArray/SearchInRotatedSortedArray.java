// Problem: Find the element in rotated Sorted Array
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class FindTarget {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int guess = (low + high) / 2;

            if(target == nums[guess]){
                return guess;
            }

            if(target <= nums[nums.length-1]){
                if(nums[guess] > nums[nums.length-1]){
                    low = guess + 1;
                }
                else{
                    if(target > nums[guess]){
                        low = guess + 1;
                    }
                    else{
                        high = guess - 1;
                    }
                }
            }

            else{
                if(nums[guess] <= nums[nums.length-1]){
                    high = guess - 1;
                }
                else{
                    if(nums[guess] > target){
                        high = guess - 1;
                    }
                    else{
                        low = guess + 1;
                    }
                }
            }
        }

        return -1;
    }
}
