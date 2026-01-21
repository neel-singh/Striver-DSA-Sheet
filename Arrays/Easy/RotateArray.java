// Problem: Left Rotate an array by D place
// Pattern: Two pointer for reversal
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class RotateArray {

    public void reverse(int[] arr, int st, int end){
        int i = st;
        int j = end-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }


    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
        
    }
}
