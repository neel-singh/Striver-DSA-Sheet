// Problem: Search for element in non-decreasing rotated Array
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class SearchInRotatedArray {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int guess = (high + low) / 2;

            if(nums[guess] == target){
                return true;
            }

            if(nums[low] == nums[guess] && nums[guess] == nums[high]) {
                low++;
                high--;
            }

            // Left half sorted
            else if(nums[low] <= nums[guess]) {
                if(target >= nums[low] && target < nums[guess]) {
                    high = guess - 1;
                } else {
                    low = guess + 1;
                }
            }

            // Right half sorted
            else {
                if(target > nums[guess] && target <= nums[high]) {
                    low = guess + 1;
                } else {
                    high = guess - 1;
                }
            }
        }

        return false;
    }
}
