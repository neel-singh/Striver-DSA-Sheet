// Problem: Find Peak Element
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class FindPeak {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-2;
        int res = nums.length-1;

        if(nums.length == 1){
            return 0;
        }

        while(low <= high){
            int guess = (low + high) / 2;

            if(nums[guess] < nums[guess+1]){
                low = guess + 1;
            }
            else{
                res = guess;
                high = guess - 1;
            }
        }

        return res;
    }
}
