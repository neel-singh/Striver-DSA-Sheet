// Problem: Linear Search
// Pattern: Traversing
// Time Complexiyt: O(n)
// Space Comlexity: O(1)

import java.util.*;

class LinearSearch {
    public int search(int arr[], int x) {
        // code here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
