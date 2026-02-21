// Problem: Floor in a Sorted Array
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class FindFloor {
    public int findFloor(int[] nums, int x) {
        // code here
        int low = 0;
        int high = nums.length-1;
        int res = -1;
        
        while(low <= high){
            int guess = (low + high) / 2;
            
            if(nums[guess] > x){
                high = guess - 1;
            }
            else{
                res = guess;
                low = guess + 1;
            }
        }
        
        return res;
    }
}
