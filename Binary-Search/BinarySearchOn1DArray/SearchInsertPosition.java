// Problem: Search Insert Position
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int res = nums.length;

        while(low <= high){
            int guess = (low + high) / 2;

            if(nums[guess] < target){
                low = guess + 1;
            }
            else{
                res = guess;
                high = guess -1;
            }
        }

        return res;
    }
}
