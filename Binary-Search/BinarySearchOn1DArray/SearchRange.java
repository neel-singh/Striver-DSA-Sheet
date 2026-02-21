// Problem: Find First and Last Position of Element in Sorted Array
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class SearchRange {
    public int[] searchRange(int[] nums, int target) {

        int res[] = new int[2];

        int low = 0;
        int high = nums.length-1;
        int l = -1;
        int f = -1;

        while(low <= high){
            int guess = (low + high) / 2;

            if(nums[guess] == target){
                l = guess;
                low = guess + 1;
            }
            else if(nums[guess] > target){
                high = guess - 1;
            }
            else{
                low = guess + 1;
            }
        }

        low = 0;
        high = nums.length-1;

        while(low <= high){
            int guess = (low + high) / 2;

            if(nums[guess] == target){
                f = guess;
                high = guess - 1;
            }
            else if(nums[guess] < target){
                low = guess + 1;
            }
            else{
                high = guess - 1;
            }
        }

        res[0] = f;
        res[1] = l;

        return res;
    }
}
