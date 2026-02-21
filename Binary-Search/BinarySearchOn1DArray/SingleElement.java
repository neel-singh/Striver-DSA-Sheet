// Problem: Find Single Element in Sorted Array
// Pattern: Binary Search
// Time Complexity: O(logn)
// Space Complexity: O(1)

class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int res = 0;

        while(low <= high){
            int guess = (low + high) / 2;

            if(guess % 2 == 1){
                guess--;
            }

            if(guess < nums.length-1 && nums[guess] == nums[guess+1]){
                low = guess + 2;
            }
            else{
                res = guess;
                high = guess - 1;
            }
        }

        return nums[res];
    }
}
