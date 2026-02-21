// Problem: Find Kth Rotation
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class FindKRotation {
    public int findKRotation(int nums[]) {
        // Code here
        int low = 0;
        int high = nums.length-1;
        int res = 0;
        
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
        
        return res;
    }
}
