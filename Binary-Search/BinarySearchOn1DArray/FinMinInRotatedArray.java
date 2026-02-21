// Problem: Find the minimum in rotated sorted Array
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class FindMin {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int res = -1;

        while(low <= high){
            int guess = (low + high) / 2;

            if(nums[guess] > nums[nums.length-1]){
                low = guess + 1;
            }
            else{
                res = guess;
                high = high - 1;
            }
        }

        return nums[res];
    }
}
