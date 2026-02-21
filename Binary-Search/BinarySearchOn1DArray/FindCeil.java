// Problem: Ceil in a Sorted Array
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(!)

class FindCeil {
    public int findCeil(int[] nums, int x) {
        // code here
        int low = 0;
        int high = nums.length -1;
        int res = -1;
        
        while(low <= high){
            int guess = (low + high) / 2;
            
            if(nums[guess] < x){
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
